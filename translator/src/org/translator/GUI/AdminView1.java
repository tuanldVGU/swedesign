package org.translator.GUI;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


import static org.translator.GUI.TranslatorGUIDialog.a;
import static org.translator.GUI.TranslatorGUIDialog.oh;

public class AdminView1 extends Application {

    private static ObservableList data =
            FXCollections.observableArrayList();

    @Override
    public void start(Stage primaryStage) throws Exception {
        a.subscribe(oh);
        primaryStage.setTitle("Transactions");

        final ListView listView = new ListView(data);
        listView.setPrefSize(300, 250);
        listView.setEditable(true);

        for (int i = 0; i < 18; i++) {
            data.add("anonym");
        }

        listView.setItems(data);
//        listView.setCellFactory(ComboBoxListCell.forListView(names));

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));
        root.add(listView,0,0);

        HBox hbtn = new HBox(10);
        hbtn.setAlignment(Pos.BOTTOM_CENTER);

        Button registButton = new Button("REGISTER");
        Button degistButton = new Button("DEGISTER");
        Button refreshButton = new Button("REFRESH");
        hbtn.getChildren().add(registButton);
        hbtn.getChildren().add(degistButton);
        hbtn.getChildren().add(refreshButton);
        root.add(hbtn,0,1);

        registButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                a.subscribe(oh);
            }
        });
        degistButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                a.unsubscribe(oh);
            }
        });
        refreshButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                data=oh.history;
                listView.setItems(data);
            }
        });
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}

