package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertions {

	@Test
	public void testAssertions() {
		String str1=new String("abc");
		String str2=new String("abc");
		String str3=null;
		String str4="abc";
		String str5="abc";
		
		int val1=5;
		int val2=6;
		
		String[] expectedArray= {"one","two","three"};
		String[] resultArray= {"one","two","three"};
		
		//check two objects are equal
		assertEquals(str1,str2);
		
		//check that a condition is true
		assertTrue(val1<val2);
		
		//check that a condition is false
		assertFalse(val1>val2);
		
		//check that a condition isnt null
		assertNull(str3);
		
		assertSame(str4,str5);
		
		assertNotSame(str1,str3);
		
		//check whether two arrays are equals to each other.
		assertArrayEquals(expectedArray,resultArray);
		
	
		assertIterableEquals(expectedArray,actualArray);
		
	}		

}
