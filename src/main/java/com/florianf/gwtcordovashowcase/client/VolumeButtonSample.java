package com.florianf.gwtcordovashowcase.client;

import com.florianf.gwtcordova.client.widget.VolumeButton;
import com.florianf.gwtcordova.client.widget.event.VolumeDownButtonPressedEvent;
import com.florianf.gwtcordova.client.widget.event.VolumeDownButtonPressedEventHandler;
import com.florianf.gwtcordova.client.widget.event.VolumeUpButtonPressedEvent;
import com.florianf.gwtcordova.client.widget.event.VolumeUpButtonPressedEventHandler;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class VolumeButtonSample extends Composite {
    interface VolumeButtonSampleUiBinder extends UiBinder<HTMLPanel, VolumeButtonSample> {
    }

    @UiField
    SpanElement volumeButton;
    int volumeButtonValue = 0;

    private static VolumeButtonSampleUiBinder ourUiBinder = GWT.create(VolumeButtonSampleUiBinder.class);

    public VolumeButtonSample() {
        initWidget(ourUiBinder.createAndBindUi(VolumeButtonSample.this));
        VolumeButton volumeButtonWidget = new VolumeButton();

        volumeButtonWidget.addVolumeDownButtonPressedHandler(vd -> volumeButton.setInnerText("" + --volumeButtonValue));

        volumeButtonWidget.addVolumeUpButtonPressedHandler(vu -> volumeButton.setInnerText(""+ ++volumeButtonValue));
    }
}
