package org.translator.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.translator.GUI.TranslatorGUIDialog.a;

public class ObserverStatistic implements Observer{
    public List<Integer> stat = new ArrayList<>();
    @Override
    public void update() {
        System.out.println("nice2");
        stat = Arrays.asList(a.statistic());
    }
}
