package com.learningJava.backend.components;

import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class FailedCloudStoragePage extends HorizontalLayout {
    public FailedCloudStoragePage () {
        setAlignItems(Alignment.CENTER);
        add(new MarkdownText("# Connection Failed\n\nTry again later"));
    }
}
