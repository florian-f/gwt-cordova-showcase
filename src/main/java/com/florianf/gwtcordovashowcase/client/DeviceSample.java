package com.florianf.gwtcordovashowcase.client;

import com.florianf.gwtcordova.client.base.Cordova;
import com.florianf.gwtcordova.client.elemental.Document;
import com.florianf.gwtcordova.client.elemental.Event;
import com.florianf.gwtcordova.client.elemental.EventListener;
import com.florianf.gwtcordova.client.plugin.device.Device;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;


/**
 * Created by florian on 24.08.15.
 */
public class DeviceSample extends Composite {
    interface DeviceSampleUiBinder extends UiBinder<HTMLPanel, DeviceSample> {

    }

    private static DeviceSampleUiBinder deviceSampleUiBinder = GWT.create(DeviceSampleUiBinder.class);

    @UiField
    VerticalPanel devicePanel;
    Label errorLabel = new Label("Something went wrong!");
    Button retryButton = new Button("retry");

    public DeviceSample() {
        initWidget(deviceSampleUiBinder.createAndBindUi(DeviceSample.this));

        String available;
        String platform;
        String version;
        String uuid;
        String cordova;
        String model;
        String manufacturer;

        try {
            platform = Device.getPlatform();
            available = Device.getAvailable();
            version = Device.getVersion();
            uuid = Device.getUuid();
            cordova = Device.getCordova();
            model = Device.getModel();
            manufacturer = Device.getManufacturer();
        } catch (Exception e) {
            available = "error";
            platform = "error";
            version = "error";
            uuid = "error";
            cordova = "error";
            model = "error";
            manufacturer = "error";
        }
        devicePanel.add(new Label("Platform: " + platform));
        devicePanel.add(new Label("Cordova: " + cordova));
        devicePanel.add(new Label("Manufacturer: " + manufacturer));
        devicePanel.add(new Label("Model: " + model));
        devicePanel.add(new Label("Uuid: " + uuid));
        devicePanel.add(new Label("Available: " + available));
        devicePanel.add(new Label("Version: " + version));
    }
}
