package com.florianf.gwtcordovashowcase.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

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