package com.florianf.gwtcordovashowcase.client;

import com.florianf.gwtcordova.client.PhoneGap;
import com.florianf.gwtcordova.client.PhoneGapAvailableEvent;
import com.florianf.gwtcordova.client.PhoneGapStandardImpl;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.iron.element.IronIconElement;
import com.vaadin.polymer.paper.element.*;

import java.util.Arrays;

public class GwtCordovaShowcase implements EntryPoint {

    public void onModuleLoad() {

        PhoneGapStandardImpl phoneGap = GWT.create(PhoneGapStandardImpl.class);

        phoneGap.addHandler((PhoneGapAvailableEvent event) -> {
            Polymer.importHref(Arrays.asList(
                    "iron-icons/iron-icons.html",
                    PaperIconItemElement.SRC,
                    PaperRippleElement.SRC,
                    IronIconElement.SRC,
                    PaperDrawerPanelElement.SRC,
                    PaperHeaderPanelElement.SRC,
                    PaperToolbarElement.SRC,
                    PaperFabElement.SRC,
                    PaperDialogElement.SRC,
                    PaperTextareaElement.SRC,
                    PaperInputElement.SRC,
                    PaperButtonElement.SRC,
                    PaperCheckboxElement.SRC
            ), arg -> {
                startApplication();
                return null;
            });
        });

        phoneGap.initializePhoneGap();

    }

    private void startApplication() {
        RootPanel.get().add(new Sampler());
    }
}
