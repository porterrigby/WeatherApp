package com.prigby;

import com.google.gson.annotations.JsonAdapter;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class MacroPane extends VBox {

    public MacroPane() {
        this.setAlignment(Pos.CENTER);

        setHeight(BASELINE_OFFSET_SAME_AS_HEIGHT);

        // set bg color, border rounding(??), and border insets(??)
        setBackground(new Background((
                        new BackgroundFill(Color.ANTIQUEWHITE, CornerRadii.EMPTY, Insets.EMPTY))));


        // fetch API data
        



        //XXX TOP OF VBOX
        Label temperature = new Label("42");
        temperature.setAlignment(Pos.CENTER);
        temperature.setStyle(String.format("-fx-font-size: %d", 42));

        //XXX BOTTOM OF VBOX
        HBox hBox = new HBox();
        

        getChildren().addAll(temperature, hBox);
    }
}