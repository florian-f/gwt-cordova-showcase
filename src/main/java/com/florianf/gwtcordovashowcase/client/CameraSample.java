package com.florianf.gwtcordovashowcase.client;

import com.florianf.gwtcordova.client.Cordova;
import com.florianf.gwtcordova.client.plugin.camera.Camera;
import com.florianf.gwtcordova.client.plugin.camera.CameraConstants;
import com.florianf.gwtcordova.client.plugin.camera.CameraOptions;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;

public class CameraSample extends Composite {
    interface CameraSampleUiBinder extends UiBinder<HTMLPanel, CameraSample> {
    }

    @UiField
    Button cameraButton;
    @UiField
    ImageElement myImage;
    @UiField
    SpanElement text;

    private static CameraSampleUiBinder ourUiBinder = GWT.create(CameraSampleUiBinder.class);

    public CameraSample() {
        initWidget(ourUiBinder.createAndBindUi(CameraSample.this));
        cameraButton.addClickHandler(clickEvent -> {
//            Camera camera = Cordova.getCamera();
//            camera.getPicture(s -> {
//                text.setInnerText("success");
//                myImage.setSrc(s);
//                return null;
//            }, s -> { text.setInnerText("error: " + s); return null; }, new CameraOptions(){});
            CameraOptions cameraOptions = new CameraOptions();
//            cameraOptions.setDestinationType(CameraConstants.DestinationType.DATA_URL);
//            cameraOptions.setCameraDirection(CameraConstants.Direction.FRONT);
            cameraOptions.setDestinationType(CameraConstants.DestinationType.FILE_URI);
            Camera.getPicture(s -> {
                text.setInnerText("success");
                myImage.setSrc(s);
                myImage.setAttribute("style", "max-width: 50%; max-height: 50%");

                return null;

            }, s -> { text.setInnerText("error: " + s); return null; }, cameraOptions);
        });
    }
}
