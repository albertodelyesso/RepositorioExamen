import java.util.ArrayList;

public class FRAME {

	private ArrayList<Integer> lista = new ArrayList<Integer>();
	
	public FRAME(){
		for (int i = 0; i < 2; i++){
			lista.add(0);
		}
	}
	
	public int getPrimero(){
		return (int) lista.get(0);
	}
	
	public int getSegundo(){
		return (int) lista.get(1);
	}
	
	public void setPrimero(int n){
		this.lista.set(0, n);
	}

	public void setSegundo(int n){
		this.lista.set(1, n);
	}
	
	public int realizarPrimerTiro(int pinos) {
		// TODO Auto-generated method stub
		int r = pinos;	
		
		if (pinos >= 0 && pinos <= 10){
			//buen valor
			this.setPrimero(pinos);
			
		}else{
			//mal valor
			r = 0;
		}
		return r;
	}
	
	public int realizarSegundoTiro(int pinos) {
		// TODO Auto-generated method stub
		int r = pinos;	
		int quedan = 10 -this.getPrimero();
		if (pinos >= 0 && quedan >= pinos){
			//buen valor
			this.setSegundo(pinos);
		}else{
			//mal valor
			r = 0;
		}
		return r;
	}

	public int verPuntaje() {
		// TODO Auto-generated method stub
		int r = 0;
		r = this.getPrimero() + this.getSegundo();
		return r;
	}
	
}
