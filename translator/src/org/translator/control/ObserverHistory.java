package org.translator.control;

import javafx.application.Application;
import org.translator.GUI.AdminView1;

import java.util.ArrayList;
import java.util.List;


public class ObserverHistory implements Observer{
    List<String> history = new ArrayList<>();
    String LastedTranslation;
    public  ObserverHistory(String x){
        LastedTranslation=x;
        history.add(LastedTranslation);
    }
    @Override
    public void update() {
        System.out.println("History Stored");
    }
}
