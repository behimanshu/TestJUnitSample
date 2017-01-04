import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void test() {
		JUnit unit = new JUnit();
		int result = unit.add(1, 2);
		assertEquals(5, result);
	}

}
