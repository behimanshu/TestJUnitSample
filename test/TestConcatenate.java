import static org.junit.Assert.*;

import org.junit.Test;

public class TestConcatenate {

	@Test
	public void test() {
		JUnit unit = new JUnit();
		String result = unit.concatenate("Himanshu", "Agarwal");
		assertEquals("HimanshuAgarwal", result);
	}

}
