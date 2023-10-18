package com.learningJava.backend.components;

import javax.annotation.Nonnull;

public class Post {
    @Nonnull
    private String title;
    @Nonnull
    private String body;

    public Post (String title, String body) {
        this.title = title;
        this.body = body;
    }
    public MarkdownText toBetterText() {
        return new MarkdownText("# " + getTitle() + "\n\n" + getBody());
    }
    @Nonnull
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Nonnull
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
