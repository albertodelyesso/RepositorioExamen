import java.util.ArrayList;

public class JUEGO {

	private ArrayList<FRAME> puntajes = new ArrayList<FRAME>();
	
	public JUEGO(){
		for (int i = 0; i < 1; i++){
			puntajes.add(new FRAME());
		}
	}

	public void puntuar(int tiro1, int tiro2, int turno) {
		
		puntajes.get(turno).setPrimero(tiro1);
		puntajes.get(turno).setSegundo(tiro2);
		
	}

	public boolean tieneExtra() {
		// TODO Auto-generated method stub
		boolean r = true;

		for (int i = 0; i < 10; i++){
			if(puntajes.get(i).getPrimero() < 10 && puntajes.get(i).getSegundo() < 10){
				r = false;
			}
		}
		
		return r;
	}
	
}
