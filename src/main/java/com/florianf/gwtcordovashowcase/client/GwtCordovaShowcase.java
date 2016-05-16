package com.florianf.gwtcordovashowcase.client;

import com.florianf.gwtcordova.client.Cordova;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class GwtCordovaShowcase implements EntryPoint {

    public void onModuleLoad() {
        Cordova.init(event -> startApplication());
    }

    private void startApplication() {
        RootPanel.get().add(new DeviceSample());
        RootPanel.get().add(new CameraSample());
    }

}
