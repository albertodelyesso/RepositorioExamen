import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class JuegoTest {

	@Test
	public void puntuarUnTurno() {
		JUEGO j = new JUEGO();
		int turno = 4;
		j.puntuarPrimero(4, turno);
		j.puntuarSegundo(3, turno);
		Assert.assertEquals(j.getPuntajes().get(turno).getPrimero(), 4);
		Assert.assertEquals(j.getPuntajes().get(turno).getSegundo(), 3);
		
	}
	
	@Test
	public void tiene_extra() {
		JUEGO j = new JUEGO();
		for (int turno = 0; turno < 10;turno++ ){
			j.puntuarPrimero(7, turno);
			j.puntuarSegundo(3, turno);
			
		}
		Assert.assertTrue(j.tieneExtra());
	}
	
	@Test
	public void no_tiene_extra() {
		JUEGO j = new JUEGO();
		for (int turno = 0; turno < 10;turno++ ){
			j.puntuarPrimero(8, turno);
			j.puntuarPrimero(10, turno);
		}
		
		Assert.assertTrue(j.tieneExtra());
	}

}
