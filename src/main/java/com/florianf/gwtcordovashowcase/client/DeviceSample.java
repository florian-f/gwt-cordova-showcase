package com.florianf.gwtcordovashowcase.client;

import com.florianf.gwtcordova.client.Cordova;
import com.florianf.gwtcordova.client.plugin.device.Device;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.paper.widget.PaperItem;

/**
 * Created by florian on 24.08.15.
 */
public class DeviceSample extends Composite {
    interface DeviceSampleUiBinder extends UiBinder<HTMLPanel, DeviceSample> {

    }
    private static DeviceSampleUiBinder deviceSampleUiBinder = GWT.create(DeviceSampleUiBinder.class);

    Device device;

    @UiField
    FlowPanel devicePanel;

    public DeviceSample() {
        initWidget(deviceSampleUiBinder.createAndBindUi(DeviceSample.this));

        device = Cordova.getDevice();
        if (device == null) {
            devicePanel.add(new PaperItem("Something went wrong!"));

        } else {
            devicePanel.add(new PaperItem("Platform: " + device.getPlatform()));
            devicePanel.add(new PaperItem("Cordova: " + device.getCordova()));
            devicePanel.add(new PaperItem("Manufacturer: " + device.getManufacturer()));
            devicePanel.add(new PaperItem("Model: " + device.getModel()));
        }

    }
}
