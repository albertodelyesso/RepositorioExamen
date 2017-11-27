import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FrameTest {

	
	@Test
	public void verPrimero() {
		FRAME f = new FRAME();
		int pinos = 5;
		f.setPrimero(pinos);
		Assert.assertEquals(f.getPrimero(), 5);
	}
	
	@Test
	public void verSegundo() {
		FRAME f = new FRAME();
		int pinos = 5;
		f.setSegundo(pinos);
		Assert.assertEquals(f.getSegundo(), 5);
	}
	
	@Test
	public void realizarPrimerTiro() {
		FRAME f = new FRAME();
		int pinos = 5;
		Assert.assertEquals(f.realizarTiro(pinos), 5);
	}

	@Test
	public void realizarSegundoTiro() {
		FRAME f = new FRAME();
		int pinos = 9;
		Assert.assertEquals(f.realizarTiro(pinos), 9);
	}
	
	@Test
	public void realizarTiroIncorrecto() {
		FRAME f = new FRAME();
		int pinos = -87;
		Assert.assertEquals(f.realizarTiro(pinos), 0);
	}
	
	
	
}
