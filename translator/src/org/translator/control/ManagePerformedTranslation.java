package org.translator.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.translator.entities.PerformedTranslation;

import javafx.collections.*;
public class ManagePerformedTranslation {
	
	private static ObservableList<PerformedTranslation> data = null;
	private static int translateOfNumber  = 0;
	private static int translateOfWord  = 0;
	private static int translateOfError  = 0;
	private static String[] numDE = new String[]{"eins", "zwei", "drei", "vier", "funf", "sechs", "sieben", "acht", "neun", "zehn"};
    private static String[] numEN = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	private static String[] phaseAndTermDE = new String[] {"hallo", "ich", "Tisch"};
	private static String[] phaseAndTermEN = new String[] {"hello", "I", "Table"};

    private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public static HashMap<String, String> store(PerformedTranslation translate) {
        ManagePerformedTranslation.data = FXCollections.observableArrayList(translate);
        return translate.getResult();
    }

	public static ObservableList<PerformedTranslation> getData() {
		return data;
	}

	public static int[] statistic(PerformedTranslation translate)
	{
		for(String value: translate.getResult().values())
		{
			for(String num: numEN)
			{
				if(num.equals(value)) translateOfNumber ++;
			}
			for(String phase: phaseAndTermDE)
			{
				if(phase.equals(value)) translateOfWord ++;
			}
			if(value.equals("error")) translateOfError++;
		}
		
		return new int []{translateOfNumber,translateOfWord,translateOfError};
	}
    public void subscribe( Observer s ){
        observers.add(s);
    }

    public void unsubscribe( Observer s ){
	    observers.remove(s);
    }

}
