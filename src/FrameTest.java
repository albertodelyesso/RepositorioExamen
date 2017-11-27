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
		f.realizarPrimerTiro(pinos);
		Assert.assertEquals(f.getPrimero(), 5);
	}

	@Test
	public void realizarSegundoTiro() {
		FRAME f = new FRAME();
		int pinos = 3;
		f.realizarPrimerTiro(6);
		f.realizarSegundoTiro(pinos);
		Assert.assertEquals(f.getSegundo(), 3);
	}
	
	@Test
	public void realizarTiroIncorrecto() {
		FRAME f = new FRAME();
		int pino1 = -87;
		int pino2 = 7;
		f.realizarPrimerTiro(pino1);
		f.realizarSegundoTiro(pino2);
		Assert.assertEquals(f.getPrimero(), 0);
		Assert.assertEquals(f.getSegundo(), 0);
	}
	

	@Test
	public void puntajecorrecto() {
		FRAME f = new FRAME();
		f.realizarPrimerTiro(6);
		f.realizarSegundoTiro(3);
		Assert.assertEquals(f.verPuntaje(), 9);
	}

	
}
