package org.translator.test;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;
import org.translator.GUI.TranslatorConsole;
import org.translator.control.ManagePerformedTranslation;
import org.translator.control.TranslateModule;

public class TestManagePerformedTranslation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TranslatorConsole.readInput();
		TranslatorConsole.display();
	}
	private HashMap<String,String> expect;
	private String[] input= new String[] {"eins","zwei","drei","vier","funf",
			"sechs","sieben","acht","neun","zehn","hallo","ich","Tisch","asss","assewq","12aae"};
	@Before
	public void setUp() throws Exception { 
		expect=new HashMap<String,String>();
		expect.put("eins","one"); 
		expect.put("zwei","two"); 
		expect.put("drei","three");
		expect.put("vier","four");
		expect.put("funf","five"); 
		expect.put("sechs","six");
		expect.put("sieben","seven");
		expect.put("acht","eight"); 
		expect.put("neun","nine");
		expect.put("zehn","ten");
		expect.put("hallo","hello"); 
		expect.put("ich","I");
		expect.put("Tisch","Table");
		expect.put("asss","error"); 
		expect.put("assewq","error");
		expect.put("12aae","error");
		
		
		
		}
	@Test
	public void testTranslate()
		{
		assertSame(expect.get("eins"),TranslateModule.translateMethod("eins").get("eins"));
		assertSame(expect.get("zwei"),TranslateModule.translateMethod("zwei").get("zwei"));
		assertSame(expect.get("drei"),TranslateModule.translateMethod("drei").get("drei"));
		assertSame(expect.get("vier"),TranslateModule.translateMethod("vier").get("vier"));
		assertSame(expect.get("funf"),TranslateModule.translateMethod("funf").get("funf"));
		assertSame(expect.get("sechs"),TranslateModule.translateMethod("sechs").get("sechs"));
		assertSame(expect.get("sieben"),TranslateModule.translateMethod("sieben").get("sieben"));
		assertSame(expect.get("acht"),TranslateModule.translateMethod("acht").get("acht"));
		assertSame(expect.get("neun"),TranslateModule.translateMethod("neun").get("neun"));
		assertSame(expect.get("zehn"),TranslateModule.translateMethod("zehn").get("zehn"));
		assertSame(expect.get("hallo"),TranslateModule.translateMethod("hallo").get("hallo"));
		assertSame(expect.get("ich"),TranslateModule.translateMethod("ich").get("ich"));
		assertSame(expect.get("Tisch"),TranslateModule.translateMethod("Tisch").get("Tisch")); //sai
		assertSame(expect.get("asss"),TranslateModule.translateMethod("asss").get("asss"));
		assertSame(expect.get("assewq"),TranslateModule.translateMethod("assewq").get("assewq"));
		assertSame(expect.get("12aae"),TranslateModule.translateMethod("12aae").get("12aae"));}
	@Test
	public void testStoreundLoad() throws Exception  {
		TranslateModule.translateMethod(input);
		String store=ManagePerformedTranslation.load();
		System.out.println(store);
		String[] arr;
		String[] end;
		arr=store.split(",");
		int i=arr.length;
		arr[0]=arr[0].replace("{","");
		arr[i-1]=arr[i-1].replace("}","");
		for(int k=0;k<i;k++)
			{end=arr[k].split("=");
			end[0]=end[0].replace(" ","");
			assertTrue(end[1].equals(expect.get(end[0])));}}}
