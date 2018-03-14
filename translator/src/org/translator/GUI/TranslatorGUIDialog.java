package org.translator.GUI;

import javafx.application.Application;
import org.translator.control.ManagePerformedTranslation;
import org.translator.control.ObserverHistory;
import org.translator.control.ObserverStatistic;

public class TranslatorGUIDialog {
    public static ManagePerformedTranslation a = new ManagePerformedTranslation();
    public static ObserverHistory oh = new ObserverHistory();
    private static Integer[] tmp = {0,0,0};
    public static ObserverStatistic os = new ObserverStatistic();
    public static void main(String[] args) {
        // write your code here
        Application.launch(TranslationView.class,args);
        System.exit(0);
    }
}
