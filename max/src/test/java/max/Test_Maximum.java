package max;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Maximum {

	@Test
	public void testWithArguments() {
		Maximum ob=new Maximum();
		int res=ob.findy(new int[] {2,3,4,5,3,2,2,2,2,2,2});
		assertEquals(2,res);
	}
	@Test
	public void testWithOutArguments() {
		Maximum ob=new Maximum();
		int res=ob.findy(new int[] {1,2,3,4,5,6});
		assertEquals(-1,res);
	}
	@Test
	public void testWithOutArguments2() {
		Maximum ob=new Maximum();
		int res=ob.findy(new int[] {});
		assertEquals(-1,res);
	}
	@Test
	public void testWithOutArguments4() {
		Maximum ob=new Maximum();
		int res=ob.findy(new int[] {1,1,1,1,2,2,2,3});
		assertEquals(1,res);
	}


}
