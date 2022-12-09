package unittesting;

import static org.junit.Assert.fail;


import org.junit.Test;

import junit.framework.TestCase;

public class CubeExampleTest extends TestCase{

	@Test
	void test() {
		fail("Not yet implemented");
		
		 assertEquals(4,Cube.cube(new int[]{1,3,4,2}));  
	}

}
