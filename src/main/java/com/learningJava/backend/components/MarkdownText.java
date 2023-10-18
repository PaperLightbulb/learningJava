package com.learningJava.backend.components;

import com.Webst2.backend.tools.MarkdownHTMLParser;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;

@Tag("div")
public class MarkdownText extends Component {
    public MarkdownText(String text) {
        String HTML = MarkdownHTMLParser.parseHTML(text);
        getElement().setProperty("innerHTML", HTML);
    }
}
