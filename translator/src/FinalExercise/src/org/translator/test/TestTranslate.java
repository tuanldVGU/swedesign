package org.translator.test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.translator.control.TranslateModule;
public class TestTranslate {
	private TranslateModule test1;
	@Before
	public void setUp() throws Exception { 
		 test1= TranslateModule.getInstance();
		}
	@Test
	public void testTranslate()
		{
		assertEquals("eins", TranslateModule.Translates("one"));
		assertEquals("zwei", TranslateModule.Translates("two"));
		assertEquals("drei", TranslateModule.Translates("three"));
		assertEquals("vier", TranslateModule.Translates("four"));
		assertEquals("funf", TranslateModule.Translates("five"));
		assertEquals("sechs", TranslateModule.Translates("six"));
		assertEquals("sieben", TranslateModule.Translates("seven"));
		assertEquals("achts", TranslateModule.Translates("eight"));
		assertEquals("neun", TranslateModule.Translates("nine"));
		assertEquals("zehn", TranslateModule.Translates("ten"));
		assertSame("Error!", TranslateModule.Translates("abc"));
		assertSame("Error!", TranslateModule.Translates("eleven"));
		}
}
