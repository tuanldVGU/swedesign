package org.translator.GUI;

import java.util.Scanner;

import org.translator.control.TranslateModule;


public class TranslatorConsole {
	private static Scanner scan = new Scanner(System.in);
	private static String input = scan.nextLine();
	private static String[] inputArr = null;
	public static void readInput() 
	{
		inputArr = input.split(" ");
		if(inputArr[0].equals("translate"))
		{
			TranslateModule.translateMethod(inputArr[1]);
		}
		
	}

}
