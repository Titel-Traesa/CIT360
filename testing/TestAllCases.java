package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAllCases {
	
	JunitTesting test = new JunitTesting();

	@Test
	public void testIsEqual() {
		int output = test.multiply(5, 8);
		assertEquals(40,output);
	}
	
	@Test
	public void testNotNull() {
	String output = test.countA("Traesa");
	assertNotNull(output);
	}
	
	@Test
	public void testIsNull() {
	String output = test.countA("Bye");
	assertNull(output);
	}
	
	@Test
	public void testTrue() {
	boolean output = test.greaterThan(7, 3);
	assertTrue(output);
	}
	
	@Test
	public void testFalse() {
	boolean output = test.greaterThan(2, 3);
	assertFalse(output);
	}
	
	@Test
	public void testSame() {
	String output = test.chkSame(4, 4);
	assertSame("same", output);
	}
	
	@Test
	public void testNotSame() {
	String output = test.chkSame(5, 4);
	assertNotSame("same", output);
	}
	
	@Test
	public void testArray() {
	char[] result = test.TestArray("hello");
	char[] expected = new char[] {'h','e','l','l','o'};
	assertArrayEquals(expected, result);
	
	}

}