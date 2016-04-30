package com.florianf.gwtcordovashowcase.client;

import com.florianf.gwtcordova.client.Cordova;
import com.florianf.gwtcordova.client.DeviceReadyEvent;
import com.florianf.gwtcordova.client.elemental.Event;
import com.florianf.gwtcordova.client.elemental.EventListener;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

import java.util.Arrays;

public class GwtCordovaShowcase implements EntryPoint {

    public void onModuleLoad() {

        Cordova.init(event -> startApplication());
//        startApplication();
//        Polymer.importHref(Arrays.asList(
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
//        Polymer.importHref("paper-styles");
//
//        // Styles for paper examples
//        Polymer.importHref("paper-styles/demo-pages.html");
//
//        // - Iconsets must be loaded before using any component depending on them
//        //   Iron comes with the collections:
//        //   communication, device, editor, hardware, image, iron, maps, notifications, social.
//        // - Animation must be loaded at the beginning as wll
//        Polymer.importHref(Arrays.asList(
//                "iron-icons/iron-icons.html",
//                "iron-icons/communication-icons.html",
//                "iron-flex-layout/iron-flex-layout.html",
//                "neon-animation/neon-animations.html",
//                IronIconElement.SRC,
//                PaperRippleElement.SRC,
//                PaperDrawerPanelElement.SRC,
//                PaperHeaderPanelElement.SRC,
//                PaperToolbarElement.SRC,
//                PaperFabElement.SRC,
//                PaperDialogElement.SRC,
//                PaperTextareaElement.SRC,
//                PaperInputElement.SRC,
//                PaperIconButtonElement.SRC,
//                PaperButtonElement.SRC,
//                PaperCheckboxElement.SRC,
//                PaperItemElement.SRC
//        ), arg -> {
//            startApplication();
//            return null;
//        });

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

//    private void startApplication() {
//        RootPanel.get().add(new Sampler());
//    }
//    private void startApplication() {
//    RootPanel.get().add(new DeviceSample());
//}
    private void startApplication() {
        RootPanel.get().add(new DeviceSample());
        RootPanel.get().add(new CameraSample());
        RootPanel.get().add(new DeviceSample());

    }

}
