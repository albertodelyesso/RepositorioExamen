import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FrameTest {

	@Test
	public void realizarTiro() {
		FRAME f = new FRAME();
		int pinos = 5;
		Assert.assertTrue(f.realizarTiro(pinos));
	}

}
