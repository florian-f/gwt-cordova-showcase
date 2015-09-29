package com.florianf.gwtcordovashowcase.client;

import com.florianf.gwtcordova.client.Cordova;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.polymer.paper.widget.PaperItem;
import com.florianf.gwtcordova.client.plugin.network.Connection;

/**
 * Created by florian on 14.09.15.
 */

public class NetworkSample extends Composite {
    interface SampleUiBinder extends UiBinder<HTMLPanel, NetworkSample> {
    }

    private static SampleUiBinder ourUiBinder = GWT.create(SampleUiBinder.class);

    @UiField
    FlowPanel networkPanel;
    
    public NetworkSample() {
        initWidget(ourUiBinder.createAndBindUi(NetworkSample.this));
        Connection connection = Cordova.getConnection();
        if (connection == null) {
            networkPanel.add(new PaperItem("Something went wrong!"));

        } else {
            networkPanel.add(new PaperItem("Connection Type: " + connection.getType()));
            networkPanel.add(new PaperItem("On Mobile Data? " + connection.onMobileData()));
            networkPanel.add(new PaperItem("On WiFi? " + connection.onWifi()));
        }
    }
}
