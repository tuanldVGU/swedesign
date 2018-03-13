package org.translator.control;
import java.util.*;
public class TranslateModule {
	 public static HashMap<String,String> newmap= new HashMap<String,String>();
		private static TranslateModule instance = new TranslateModule();
		private TranslateModule() {}
		public static TranslateModule getInstance() {return instance;}
		public  static String Translates (String numGe) {
			String result="Errors!!";
			newmap.put("one","eins");
			newmap.put("two","zwei");
			newmap.put("three","drei");
			newmap.put("four","vier");
			newmap.put("five","funf");
			newmap.put("six","sechs");
			newmap.put("seven","sieben");
			newmap.put("eight","achts");
			newmap.put("nine","neun");
			newmap.put("ten","zehn");
			result=(String)newmap.get(numGe);
			if(result==null) {result="Error!";}
			return result;
			
			}
		public static void addTranslate(String pharse, String pha)
			{newmap.put(pharse,pha);
			System.out.println("Stored");}

}
