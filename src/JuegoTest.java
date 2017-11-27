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
	public void identificarFRAMEEXTRA(){
		JUEGO j = new JUEGO();
					
		j.agregarExtra();
		j.puntuarPrimero(4, 10);
		j.puntuarSegundo(10, 10);
		
		Assert.assertEquals("FRAMEEXTRA", j.getPuntajes().get(10).getClass().getName());
		
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
	
	@Test
	public void todosPlenos(){
		JUEGO j = new JUEGO();
		for (int turno = 0; turno < 10;turno++ ){
			j.puntuarPrimero(10, turno);
			j.puntuarSegundo(0, turno);	
		}
		
		Assert.assertTrue(j.TodosPlenos());
		
	}
	
	
	@Test
	public void puntajeTotal300(){
		JUEGO j = new JUEGO();
				
		for (int turno = 0; turno < 10;turno++ ){
			j.puntuarPrimero(10, turno);
			j.puntuarSegundo(0, turno);
		}
		j.agregarExtra();
		j.puntuarPrimero(10, 10);
		j.puntuarSegundo(10, 10);
	
		Assert.assertEquals(300, j.calcularPuntaje());
	}


	@Test
	public void puntajeTotal128(){
		JUEGO j = new JUEGO();
				
		j.puntuarPrimero(2, 0);
		j.puntuarSegundo(3, 0);
		j.puntuarPrimero(10, 1);
		j.puntuarSegundo(0, 1);
		j.puntuarPrimero(10, 2);
		j.puntuarSegundo(0, 2);
		j.puntuarPrimero(4, 3);
		j.puntuarSegundo(5, 3);
		j.puntuarPrimero(3, 4);
		j.puntuarSegundo(5, 4);
		j.puntuarPrimero(5, 5);
		j.puntuarSegundo(4, 5);
		j.puntuarPrimero(5, 6);
		j.puntuarSegundo(4, 6);
		j.puntuarPrimero(6, 7);
		j.puntuarSegundo(3, 7);
		j.puntuarPrimero(4, 8);
		j.puntuarSegundo(4, 8);
		j.puntuarPrimero(10, 9);
		j.puntuarSegundo(0, 9);

		
		j.agregarExtra();
		j.puntuarPrimero(4, 10);
		j.puntuarSegundo(10, 10);
		
		Assert.assertEquals(128, j.calcularPuntaje());
	}
	
	
	
}
