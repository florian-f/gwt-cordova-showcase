package com.florianf.gwtcordova.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.polymer.elemental.HTMLElement;
import com.vaadin.polymer.paper.element.*;

/**
 * Created by florian on 23.08.15.
 */
public class Main extends Composite {
    interface MainUiBinder extends UiBinder<HTMLPanel, Main> {
    }

    private static MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);

//    @UiField PaperDrawerPanelElement drawerPanel;
//
//    @UiField PaperIconItemElement menuClearAll;
////    @UiField PaperIconItemElement menuClearDone;
//
//    @UiField HTMLElement content;
//    @UiField PaperFabElement addButton;

//    @UiField PaperDialogElement addItemDialog;
//    @UiField PaperInputElement titleInput;
//    @UiField PaperTextareaElement descriptionInput;
//    @UiField PaperButtonElement confirmAddButton;


    public Main() {
        initWidget(ourUiBinder.createAndBindUi(this));

    }
}
