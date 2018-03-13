package org.translator.control;
<<<<<<< HEAD

import java.util.HashMap;

import org.translator.entities.PerformedTranslation;

public class TranslateModule {
	private static HashMap<String, String> number = new HashMap<String,String>();
	private static HashMap<String, String> phase_term = new HashMap<String,String>();
	private static HashMap<String, String> result = new HashMap<String,String>();
	private static String[] numDE = new String[]{"eins", "zwei", "drei", "vier", "funf", "sechs", "sieben", "acht", "neun", "zehn"};
    private static String[] numEN = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
	private static String[] phaseAndTermDE = new String[] {"hallo", "ich", "Tisch"};
	private static String[] phaseAndTermEN = new String[] {"hello", "I", "Table"};
	
    public static  HashMap<String, String> translateMethod(String[] input)
	{
    		createTranslationMethod();
		PerformedTranslation translate = PerformedTranslation.getInstance();
		for(String inputTerm: input)
		{
			if(number.get(inputTerm)!=null)
				result.put(inputTerm, number.get(inputTerm));
			else if(phase_term.get(inputTerm)!=null)
				result.put(inputTerm, phase_term.get(inputTerm));
			else result.put(inputTerm, "error");
			
		}
		translate.setResult(result);
		//ManagePerformedTranslation.store(translate);
		return ManagePerformedTranslation.store(translate);
		
		
	}
    
    public static HashMap<String, String> translateMethod(String input)
	{
    		createTranslationMethod();
		PerformedTranslation translate = PerformedTranslation.getInstance();
			if(number.get(input)!=null)
				result.put(input, number.get(input));
			else if(phase_term.get(input)!=null)
				result.put(input, phase_term.get(input));
			else result.put(input, "error");
		translate.setResult(result);
		//ManagePerformedTranslation.store(translate);
		return ManagePerformedTranslation.store(translate);
		
		
	}
	
	//put value to hashmap
	
	public static void createTranslationMethod() {
		for(int i = 0; i < 10; ++i) {
			number.put(numDE[i], numEN[i]);
		}
		for(int i = 0; i < 2; ++i) {
			phase_term.put(phaseAndTermDE[i], phaseAndTermEN[i]);
		}
		
	}
	
=======

}
