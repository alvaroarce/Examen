package test.com.cenfotec.logic;

import com.cenfotec.logic.Analytics;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AnalyticsTest {
	
	@Test
 	public void testPalabraMasLarga() {
 		String word = "Hola,mundo";
 		
 		String[] result = new String[] {"mundo"};
 		
 		String  solution = Analytics.masLarga(word);
 		
 		aasertArrayEquals(result,solution);
	}
	
	@Test
 	public void testPalabraMasCorta() {
 		String word = "Hola,mundo";
 		
 		String[] result = new String[] {"Hola, mundo"};
 		
 		String solution = Analytics.masCorta(word);
 		
 		aasertArrayEquals(result,solution);
	}
	
	public 
}
