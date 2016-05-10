package rob.robart;

import org.junit.Test;

import junit.framework.TestCase;

public class ThisIntTest extends TestCase {

	@Test
	public void testSetThisInt(){
		GetSet g = new GetSet();
		g.setThisInt(20);
		assertEquals(15, g.thisInt);
	}
}
