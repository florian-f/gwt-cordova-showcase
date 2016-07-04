package com.florianf.gwtcordovashowcase.client;

import com.florianf.gwtcordova.client.base.Cordova;
import com.florianf.gwtcordova.client.elemental.Document;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtCordovaShowcase implements EntryPoint {

    public void onModuleLoad() {
        Document.addEventListener("deviceready", event -> startApplication());
    }

    private void startApplication() {
        RootPanel.get().add(new DeviceSample());
        RootPanel.get().add(new CameraSample());
    }

}
