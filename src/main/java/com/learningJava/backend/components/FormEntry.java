package com.learningJava.backend.components;

import com.learningJava.backend.Constants;
import com.learningJava.backend.tools.CloudStorage;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;

public class FormEntry extends VerticalLayout {
    private TextField titleTextField;
    private TextArea answerTextField;
    public Button submitButton = new Button("Submit");

    public FormEntry(String formBucketName, CloudStorage cloudStorage) {
        answerTextField = new TextArea();
        titleTextField = new TextField();

        HorizontalLayout horizontalLayout = new HorizontalLayout();

        answerTextField.setPlaceholder("Body");
        titleTextField.setPlaceholder("Title");
        titleTextField.setWidth("150%");

        submitButton.getStyle().setColor(Constants.white);
        submitButton.getStyle().setBackground(Constants.black);

        horizontalLayout.add(titleTextField, submitButton);

        setAlignItems(Alignment.CENTER);

        answerTextField.setWidthFull();
        answerTextField.setHeight("50%");

        add(horizontalLayout, answerTextField);

        submitButton.addClickListener(clickEvent -> {
            cloudStorage.writeData(titleTextField.getValue(), formBucketName, answerTextField.getValue());

            titleTextField.setValue("");
            answerTextField.setValue("");
        });
    }
}
