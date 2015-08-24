package com.florianf.gwtcordova.client;

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

    @UiField
    FlowPanel devicePanel;

    public DeviceSample() {
        initWidget(deviceSampleUiBinder.createAndBindUi(DeviceSample.this));

        devicePanel.add(new PaperItem("Platform"));
        devicePanel.add(new PaperItem("Version"));
    }
}
