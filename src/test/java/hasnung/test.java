package hasnung;

import static org.junit.Assert.*;

import org.junit.Test;

public class test {

	@Test
	public void test() {
		clan c = new clan();
		int k = c.add(8, 7);
		assertEquals(k, 15);
	}

}
