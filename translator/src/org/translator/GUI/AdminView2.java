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

import java.util.ArrayList;
import java.util.List;

import static org.translator.GUI.TranslatorGUIDialog.a;
import static org.translator.GUI.TranslatorGUIDialog.os;

public class AdminView2 extends Application {
    private Integer sum=0;
    private List<Integer> list = new ArrayList<>();
    @Override
    public void start(Stage primaryStage) throws Exception {
        a.subscribe(os);
        primaryStage.setTitle("Statistic");
        //Create Grid
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 400, 275);
        primaryStage.setScene(scene);
        //Translation
        Label num = new Label("Number:");
        grid.add(num, 0, 1);

        TextField numTextField = new TextField("0%");
        grid.add(numTextField, 1, 1);
        numTextField.setDisable(true);
        
        Label pat = new Label("Phase and term:");
        grid.add(pat, 0, 2);

        TextField patTextField = new TextField("0%");
        grid.add(patTextField, 1, 2);
        patTextField.setDisable(true);

        Label err = new Label("Errors:");
        grid.add(err, 0, 3);

        TextField errTextField = new TextField("0%");
        grid.add(errTextField, 1, 3);
        errTextField.setDisable(true);

        HBox hbtn = new HBox(10);
        hbtn.setAlignment(Pos.BOTTOM_CENTER);

        Button registButton = new Button("REGISTER");
        Button degistButton = new Button("DEGISTER");
        Button refreshButton = new Button("REFRESH");
        hbtn.getChildren().add(registButton);
        hbtn.getChildren().add(degistButton);
        hbtn.getChildren().add(refreshButton);
        grid.add(hbtn,1,4);

        registButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                a.subscribe(os);
            }
        });
        degistButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                a.unsubscribe(os);
            }
        });
        refreshButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                list=os.stat;
                sum=0;
                for (int i=0;i<list.size();i++){sum+=list.get(i);
                System.out.println(list.get(i));}
                System.out.println(sum);
                Double x = (double) list.get(0)/sum;
                numTextField.setText((x*100)+"%");
                x = (double) list.get(1)/sum;
                patTextField.setText((x*100)+"%");
                x = (double) list.get(2)/sum;
                errTextField.setText((x*100)+"%");
            }
        });
        primaryStage.show();
    }

}
