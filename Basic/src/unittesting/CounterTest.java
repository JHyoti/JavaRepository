package unittesting;





import junit.framework.TestCase;

class CounterTest extends TestCase{
	Counter counter1;
	public CounterTest() { 
		
	} // default constructor
	protected void setUp() { // creates a (simple) test fixture
	counter1 = new Counter();
	}
	protected void tearDown() 
	{ } // no resources to release
	public void testIncrement() {
	assertTrue(counter1.increment() == 1);
	assertTrue(counter1.increment() == 2);
	}
	public void testDecrement() {
		assertTrue(counter1.increment() == 1);
		assertTrue(counter1.increment() == 2);
		}
}

	

