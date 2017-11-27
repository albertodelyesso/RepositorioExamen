import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class JuegoTest {

	@Test
	public void tiene_extra() {
		JUEGO j = new JUEGO();
		for (int i = 0; i < 10;i++ ){
			j.puntuar(10,10,i);
			System.out.println("tiene: "+i);
		}
		
		Assert.assertTrue(j.tieneExtra());
	}
	
	@Test
	public void no_tiene_extra() {
		JUEGO j = new JUEGO();
		for (int i = 0; i < 10;i++ ){
			j.puntuar(3,10,i);
		}
		Assert.assertTrue(j.tieneExtra());
	}

}
