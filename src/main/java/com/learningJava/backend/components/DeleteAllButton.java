package com.learningJava.backend.components;

import com.Webst2.backend.Constants;
import com.Webst2.backend.tools.CloudStorage;
import com.vaadin.flow.component.button.Button;

public class DeleteAllButton extends Button {
    public DeleteAllButton(String bucketName, CloudStorage cloudStorage) {
        setText("Delete All");

        getStyle().setColor(Constants.white);
        getStyle().setBackground(Constants.black);

        addClickListener(clickEvent -> {
            cloudStorage.deleteAllDataInBucket(bucketName);
        });
    }
}
