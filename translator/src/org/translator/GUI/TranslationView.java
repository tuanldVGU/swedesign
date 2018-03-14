package org.translator.GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.translator.control.TranslateModule;

public class TranslationView extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Translate");
        //Create Grid
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        //Translation
        Label from = new Label("German:");
        grid.add(from, 0, 1);

        TextField fromTextField = new TextField();
        grid.add(fromTextField, 1, 1);

        Label to = new Label("English:");
        grid.add(to, 0, 2);
        TextField toTextField = new TextField();
        grid.add(toTextField, 1, 2);
        toTextField.setDisable(true);
        //Setup button
        HBox hbtn = new HBox(10);
        hbtn.setAlignment(Pos.BOTTOM_RIGHT);

        Button transButton = new Button("Translate");
        transButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                toTextField.setText(TranslateModule.translateMethod(fromTextField.getText()).get(fromTextField.getText()));
            }
        });

        Button hisButton = new Button("History");
        hisButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Application app = AdminView1.class.newInstance();
                    app.start(new Stage());
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Button statButton = new Button("Statistic");
        statButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    Application app = AdminView2.class.newInstance();
                    app.start(new Stage());
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        hbtn.getChildren().add(transButton);
        hbtn.getChildren().add(hisButton);
        hbtn.getChildren().add(statButton);
        grid.add(hbtn,1,4);
        primaryStage.show();
    }
}
