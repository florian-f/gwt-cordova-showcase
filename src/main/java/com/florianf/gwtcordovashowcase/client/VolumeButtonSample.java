package com.florianf.gwtcordovashowcase.client;


import com.florianf.gwtcordova.client.elemental.Document;
import com.google.gwt.core.client.GWT;
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

        Document.addEventListener("volumebuttonup", vd -> volumeButton.setInnerText("" + --volumeButtonValue));

        Document.addEventListener("volumebuttondown", vu -> volumeButton.setInnerText(""+ ++volumeButtonValue));
    }
}
