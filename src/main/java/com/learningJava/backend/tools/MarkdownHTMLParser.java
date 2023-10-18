package com.learningJava.backend.tools;


import com.vaadin.flow.server.VaadinRequest;
import com.vaadin.flow.server.VaadinService;
import com.vaadin.flow.server.VaadinServletRequest;
import com.vladsch.flexmark.html.HtmlRenderer;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.options.MutableDataSet;
import jakarta.servlet.http.HttpServletRequest;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.markdownj.MarkdownProcessor;

public class MarkdownHTMLParser {

    public static String parseHTML (String markdownString) {
        VaadinRequest vaadinRequest = VaadinService.getCurrentRequest();
        HttpServletRequest httpServletRequest = ((VaadinServletRequest)vaadinRequest).getHttpServletRequest();
        String requestUrl = httpServletRequest.getRequestURL().toString();

        String targetName = "";
        char lastChar = ' ';

        for (int i = 0; i < markdownString.length(); i++) {
            if (markdownString.charAt(i) == '[' && lastChar == '['){
                for (int j = i+1; j < markdownString.length(); j++) {
                    if (markdownString.charAt(j) == ']' && lastChar == ']'){
                        targetName = targetName.substring(0, targetName.length()-1);
                        int oldMarkdownStringLength = markdownString.length();
                        markdownString = markdownString.substring(0, i-2) + " [" + targetName + "]("+ requestUrl + "snippet/" + targetName + ")" + markdownString.substring(j+1) + " ";
                        System.out.println(markdownString);
                        i = j + markdownString.length() - oldMarkdownStringLength;
                    }
                    targetName = targetName + markdownString.charAt(j);
                    lastChar = markdownString.charAt(j);
                }
            }
            lastChar = markdownString.charAt(i);
        }
        MarkdownProcessor markdownProcessor = new MarkdownProcessor();
        return markdownProcessor.markdown(markdownString);
    }
    public static String parseMarkdown (String HTMLString) {
        Document doc = Jsoup.parse(HTMLString);
        Element body = doc.body();

        MutableDataSet options = new MutableDataSet();
        Parser parser = Parser.builder(options).build();
        HtmlRenderer renderer = HtmlRenderer.builder(options).build();

        return renderer.render(parser.parse(body.html()));
    }

}
