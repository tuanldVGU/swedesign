package org.translator.control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.translator.entities.PerformedTranslation;

import javafx.collections.*;
public class ManagePerformedTranslation {
	
	private static ObservableList<String> data = FXCollections.observableArrayList();
	private static PerformedTranslation temp = new PerformedTranslation();
	private static String[] numDE = new String[]{"eins", "zwei", "drei", "vier", "funf", "sechs", "sieben", "acht", "neun", "zehn"};
    private static String[] numEN = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	private static String[] phaseAndTermDE = new String[] {"hallo", "ich", "Tisch"};
	private static String[] phaseAndTermEN = new String[] {"hello", "I", "Table"};

    private List<Observer> observers = new ArrayList<Observer>();

	public static HashMap<String, String> store(PerformedTranslation translate) {
		String review;
		for(String key : translate.getResult().keySet()) {
			review = key + " to " + translate.getResult().get(key);
			ManagePerformedTranslation.data.add(review);
		}
		temp = translate;
        return translate.getResult();
    }

    public static String load()
	{
		return temp.getResult().toString();
	}

	public static ObservableList<String> getData() {
		return data;
	}

	public static Integer[] statistic()
	{
		Integer translateOfNumber=0;
		Integer translateOfWord=0;
		Integer translateOfError=0;
		for(String value: temp.getResult().values())
		{
			for(String num: numEN)
			{
				if(num.equals(value)) translateOfNumber ++;
			}
			for(String phase: phaseAndTermEN)
			{
				if(phase.equals(value)) translateOfWord ++;
			}
			if(value.equals("error")) translateOfError++;
		}
		
		return new Integer[] {translateOfNumber,translateOfWord,translateOfError};
	}
    public void subscribe( Observer s ){
		boolean isExist=false;
		for (int i=0;i<observers.size();i++){if(observers.get(i)==s){isExist=true;}}
		if (observers.size()<2 && isExist==false) {observers.add(s); s.update();}
    }

    public void unsubscribe( Observer s ){
	    observers.remove(s);
    }

    public void updateAll(){
		for (int i=0; i<observers.size();i++){
			observers.get(i).update();
		}
	}

}
