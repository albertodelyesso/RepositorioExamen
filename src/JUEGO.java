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
			r = true;
			
		}
		return r;
	}
	
	

	public int calcularPuntaje() {
		// TODO Auto-generated method stub

		int acum = 0;
		int k;
		int extras = 0;
		int todo = 0;
		int tamanio = puntajes.size();

		for(int i = 0 ; i < tamanio; i++){
			acum = puntajes.get(i).verPuntaje();

			if (this.framePleno(puntajes.get(i))){
				k = i + 1;
				if(k < 10){
					extras = puntajes.get(i+1).verPuntaje();

				}
				k = k + 1;
				if(k <10){
					extras = extras + puntajes.get(i+2).verPuntaje();

				}
			}
			acum = acum + extras;
			todo = todo + acum;
		}

		return todo;
	}

	public boolean TodosPlenos() {
		// TODO Auto-generated method stub
		boolean r = true;
		
		for(int i = 0 ; i < 10; i++){
			if(this.framePleno(puntajes.get(i)) == false){
				r = false;
			}
		}
		
		if(r == true){
			puntajes.add(new FRAMEEXTRA());
		}
		
		return r;
	}

	void agregarExtra() {
		// TODO Auto-generated method stub
		puntajes.add(new FRAMEEXTRA());
	}
	
	
	
}
