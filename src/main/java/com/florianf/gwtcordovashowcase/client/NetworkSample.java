package com.florianf.gwtcordovashowcase.client;

import com.florianf.gwtcordova.client.base.Cordova;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.florianf.gwtcordova.client.plugin.network.Connection;

/**
 * Created by florian on 14.09.15.
 */

public class NetworkSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, NetworkSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    @UiField
    VerticalPanel networkPanel;
    
    public NetworkSample() {
        initWidget(ourUiBinder.createAndBindUi(NetworkSample.this));

            networkPanel.add(new Label("Connection Type: " + Connection.getType()));
            networkPanel.add(new Label("On Mobile Data? " + Connection.onMobileData()));
            networkPanel.add(new Label("On WiFi? " + Connection.onWifi()));
    }
}
