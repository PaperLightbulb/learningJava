package com.learningJava.backend.components;

import com.Webst2.backend.Constants;
import com.Webst2.backend.tools.CloudStorage;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class FormDeletion extends HorizontalLayout {

    TextField titleTextField = new TextField();
    public Button deleteButton = new Button("Delete");
    public FormDeletion(String formBucketName, CloudStorage cloudStorage) {
        titleTextField.setPlaceholder("Title");

        deleteButton.getStyle().setColor(Constants.white);
        deleteButton.getStyle().setBackground(Constants.black);

        add(titleTextField, deleteButton);
        titleTextField.setWidth("150%");

        setAlignItems(Alignment.BASELINE);

        deleteButton.addClickListener(clickEvent -> {
            cloudStorage.deleteData(titleTextField.getValue(), formBucketName);
            titleTextField.setValue("");
        });
    }
}
