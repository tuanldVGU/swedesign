package org.translator.control;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import static org.translator.GUI.TranslatorGUIDialog.a;

public class ObserverHistory implements Observer{
    public ObservableList<String> history = FXCollections.observableArrayList();
    @Override
    public void update() {
        history=a.getData();
    }
}
