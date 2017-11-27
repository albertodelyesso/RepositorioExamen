import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class JuegoTest {

	@Test
	public void tiene_extra() {
		JUEGO j = new JUEGO();
		for (int turno = 0; turno < 10;turno++ ){
			j.puntuarPrimero(10, turno);
			j.puntuarPrimero(10, turno);
			System.out.println("tiene: "+turno);
		}
		
		Assert.assertTrue(j.tieneExtra());
	}
	
	@Test
	public void no_tiene_extra() {
		JUEGO j = new JUEGO();
		for (int turno = 0; turno < 10;turno++ ){
			j.puntuarPrimero(8, turno);
			j.puntuarPrimero(10, turno);
			System.out.println("tiene: "+turno);
		}
		
		Assert.assertTrue(j.tieneExtra());
	}

}
