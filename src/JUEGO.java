import java.util.ArrayList;

public class JUEGO {

	private ArrayList<FRAME> puntajes = new ArrayList<FRAME>();
	
	public JUEGO(){
		for (int i = 0; i < 10; i++){
			puntajes.add(new FRAME());
		}
	}
	
	public ArrayList<FRAME> getPuntajes(){
		return this.puntajes;
	}

	public void puntuarPrimero(int tiro1, int turno) {
		
		puntajes.get(turno).realizarPrimerTiro(tiro1);
		
	}

	public void puntuarSegundo(int tiro2, int turno) {
		
		puntajes.get(turno).realizarSegundoTiro(tiro2);
		
	}
	
	public boolean tieneExtra() {
		// TODO Auto-generated method stub
		boolean r = true;

		int valor1;
		int valor2;
		int total;

		for (int i = 0; i < 10; i++){
			valor1 = puntajes.get(i).getPrimero();
			valor2 = puntajes.get(i).getSegundo();
			total = valor1 + valor2;

			if( total  < 10){
				r = false;
			}
		}
		
		return r;
	}
	
	public boolean framePleno(FRAME f){
		boolean r = false;
		
		if(f.getPrimero() == 10){
			System.out.println("--- "+f.getPrimero());
			r = true;
			
		}
		return r;
	}
	
	

	public int calcularPuntaje() {
		// TODO Auto-generated method stub
		ArrayList<Integer> extras = new ArrayList<Integer>();
		int contador = 0;
		int acum = 0;
		for(int i = 0 ; i < puntajes.size(); i++){
			acum = puntajes.get(i).verPuntaje();
			if (this.framePleno(puntajes.get(i))){

				for (int k = 1; k < 3; k++){
					if ((i+k) < puntajes.size()){
						acum = puntajes.get(i+k).verPuntaje();						
					}
				}
			}
		}
		
		return acum;
	}

	public boolean TodosPlenos() {
		// TODO Auto-generated method stub
		boolean r = true;
		
		for(int i = 0 ; i < puntajes.size(); i++){
			if(this.framePleno(puntajes.get(i)) == false){
				r = false;
			}
		}
		
		return r;
	}
	
	
	
}
