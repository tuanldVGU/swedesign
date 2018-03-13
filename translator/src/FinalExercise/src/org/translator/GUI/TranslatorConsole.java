package org.translator.GUI;

import java.util.HashMap;
import java.util.Scanner;

import org.translator.control.TranslateModule;


public class TranslatorConsole {
	private static Scanner scan = new Scanner(System.in);
	private static String input = scan.nextLine();
	private static String[] inputArr = null;
	private static HashMap<String,String> result = new HashMap<String,String>();
	public static void readInput() 
	{
		inputArr = input.split(" ");
		if(inputArr[0].equals("translate"))
		{
<<<<<<< HEAD
			try {
				TranslatorConsole.result = TranslateModule.translateMethod(inputArr[1].split(";"));
				
			}
			catch(Exception e)
			{
				TranslatorConsole.result = TranslateModule.translateMethod(inputArr[1]);
				
			}
=======
			TranslateModule.Translates(inputArr[1]);
		}
>>>>>>> master
		
		}
	}
	public static void display()
	{
		System.out.println(result);
	}

}
