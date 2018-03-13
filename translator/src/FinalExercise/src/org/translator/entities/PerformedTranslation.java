package org.translator.entities;

import java.util.HashMap;

public class PerformedTranslation {
	
	private HashMap<String, String> result = new HashMap<String,String>();

	
	

	PerformedTranslation (){
		
	}
	
	private static PerformedTranslation translate = null;
	
	//create instance method
	public static synchronized PerformedTranslation getInstance()
	{
		if(translate==null) 
			return new PerformedTranslation();
		else return translate;
	}
	
	
	//getter, setter method
	public HashMap<String, String> getResult() {
		return this.result;
	}

	public void setResult(HashMap<String, String> result) {
		this.result = result;
	}


	
	
	

}
