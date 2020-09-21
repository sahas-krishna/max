package max;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
//Class used for testing the maximum element
public class MaximumTest { 
	//Empty constructor to attain standards	
	// Test case to return maximum occurred element
	@Test
	public void testWithArguments() throws Exception {
		int res=Maximum.findy(new int[] {2,3,4,5,3,2,2,2,2,2,2});
		assertEquals(2,res);
	}
	//Test case to check the usage of exception
	@Test
	public void testWithOutArguments() {
	    Exception exception = Assertions.assertThrows(InvalidException.class, () -> {
	        Maximum.findy(new int[] {1,2,3,4,5,6});
	    });
	 
	    String expectedMessage = "No element occurred more than the half of the length of the array";
	    String actualMessage = exception.getMessage();
	 
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	@Test
	//Test case to check the output if it is an empty array
	public void testWithOutArguments2(){
	     Exception exception = Assertions.assertThrows(InvalidException.class, () -> {
	        Maximum.findy(new int[] {});
	    });
	 
	    String expectedMessage = "No element occurred more than the half of the length of the array";
	    String actualMessage = exception.getMessage();
	    assertTrue(actualMessage.contains(expectedMessage));
	}
	@Test
	//Revised exceptions for another input
	public void testWithOutArguments4() throws Exception {
		int res=Maximum.findy(new int[] {1,1,1,1,2,2,2,3});
		assertEquals(1,res);
	}
}
