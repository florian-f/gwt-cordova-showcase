package com.florianf.gwtcordovashowcase.client;

import com.florianf.gwtcordova.client.elemental.Document;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class LifecycleSample extends Composite {
    interface LifecycleSampleUiBinder extends UiBinder<HTMLPanel, LifecycleSample> {
    }

    @UiField
    SpanElement pauseFired;
    @UiField
    SpanElement resumeFired;

    int pauseCount = 0;
    int resumeCount = 0;

    private static LifecycleSampleUiBinder ourUiBinder = GWT.create(LifecycleSampleUiBinder.class);

    public LifecycleSample() {

        initWidget(ourUiBinder.createAndBindUi(LifecycleSample.this));

        Document.addEventListener("pause", pauseEvent -> pauseFired.setInnerText(" " + ++pauseCount));

        Document.addEventListener("resume", resumeEvent -> resumeFired.setInnerText(" " + ++resumeCount));
    }
}
