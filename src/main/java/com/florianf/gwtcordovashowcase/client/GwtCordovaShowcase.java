package com.florianf.gwtcordovashowcase.client;

import com.florianf.gwtcordova.client.Cordova;
import com.florianf.gwtcordova.client.DeviceReadyEvent;
import com.florianf.gwtcordova.client.elemental.Event;
import com.florianf.gwtcordova.client.elemental.EventListener;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.iron.element.IronIconElement;
import com.vaadin.polymer.paper.element.*;

import java.util.Arrays;

public class GwtCordovaShowcase implements EntryPoint {

    public void onModuleLoad() {

        Cordova.init(new EventListener() {
            @Override
            public Object call(Event event) {

                return null;
            }
        });

        Polymer.importHref(Arrays.asList(
                "iron-icons/iron-icons.html",
                PaperIconItemElement.SRC,
                PaperRippleElement.SRC,
                IronIconElement.SRC,
                PaperDrawerPanelElement.SRC,
                PaperHeaderPanelElement.SRC,
                PaperToolbarElement.SRC,
                PaperFabElement.SRC,
                PaperDialogElement.SRC,
                PaperTextareaElement.SRC,
                PaperInputElement.SRC,
                PaperButtonElement.SRC,
                PaperCheckboxElement.SRC
        ), arg -> {
            startApplication();
            return null;
        });

//        Cordova.init(event -> Polymer.importHref(Arrays.asList(
//                "iron-icons/iron-icons.html",
//                PaperIconItemElement.SRC,
//                PaperRippleElement.SRC,
//                IronIconElement.SRC,
//                PaperDrawerPanelElement.SRC,
//                PaperHeaderPanelElement.SRC,
//                PaperToolbarElement.SRC,
//                PaperFabElement.SRC,
//                PaperDialogElement.SRC,
//                PaperTextareaElement.SRC,
//                PaperInputElement.SRC,
//                PaperButtonElement.SRC,
//                PaperCheckboxElement.SRC
//        ), arg -> {
//            startApplication();
//            return null;
//        });
//        return null;
//        );

//        Cordova.init(new DeviceReadyEvent.Listener() {
//            @Override
//            protected void handleEvent(DeviceReadyEvent deviceReadyEvent) {
//                Polymer.importHref(Arrays.asList(
//                        "iron-icons/iron-icons.html",
//                        PaperIconItemElement.SRC,
//                        PaperRippleElement.SRC,
//                        IronIconElement.SRC,
//                        PaperDrawerPanelElement.SRC,
//                        PaperHeaderPanelElement.SRC,
//                        PaperToolbarElement.SRC,
//                        PaperFabElement.SRC,
//                        PaperDialogElement.SRC,
//                        PaperTextareaElement.SRC,
//                        PaperInputElement.SRC,
//                        PaperButtonElement.SRC,
//                        PaperCheckboxElement.SRC
//                ), arg -> {
//                    startApplication();
//                    return null;
//                });
//            }
//        });


    }

    private void startApplication() {
        RootPanel.get().add(new Sampler());
    }
}
