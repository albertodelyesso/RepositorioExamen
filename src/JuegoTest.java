import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class JuegoTest {

	@Test
	public void tiene_extra() {
		JUEGO j = new JUEGO();
		
		Assert.assertTrue(j.puntuar(4,5,2));
	}

}
