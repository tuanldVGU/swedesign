package org.translator.control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObserverStatistic implements Observer{
    List<Integer> stat = new ArrayList<>();
    public  ObserverStatistic(Integer[] x){
        stat = Arrays.asList(x);
    }
    @Override
    public void update() {
        System.out.println("Statistic Stored");
    }
}
