import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultiply {

	@Test
	public void test() {
		JUnit unit = new JUnit();
		int result = unit.multiply(3, 5);
		assertEquals(45,result);
	}

}
