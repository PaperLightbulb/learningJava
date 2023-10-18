package com.learningJava.views;

import com.learningJava.backend.components.*;
import com.learningJava.backend.tools.CloudStorage;
import com.learningJava.backend.tools.UrlGetter;
import com.learningJava.projects.knave.Knave;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.learningJava.backend.Constants;

import java.io.IOException;
import java.util.ArrayList;

@Route("")
@PageTitle("Home")
public class HomeView extends VerticalLayout {
    public HomeView(){
        setAlignItems(FlexComponent.Alignment.CENTER);

        Knave knave = new Knave();

        add(new MarkdownText(knave.toString()));
    }

}
