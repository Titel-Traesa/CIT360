package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class multiplyTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.multiply(5, 8);
		assertEquals(40,output);
	}
	

}
