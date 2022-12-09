package unittesting;




import org.junit.Test;

import junit.framework.TestCase;

class MaxTest extends TestCase{

	@Test
	void test() {
		fail("Not yet implemented");
	}
	public void findMax()
	{
		assertEquals(4,Calculation.maxNum(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculation.maxNum(new int[]{-12,-1,-3,-4,-2})); 
	

		
	}


}
