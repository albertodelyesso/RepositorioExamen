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
	
	public int realizarTiro(int pinos) {
		// TODO Auto-generated method stub
		int r = pinos;	
		
		if (pinos >= 0 && pinos < 11){
			this.lista.add(pinos);
			
			System.out.println("tiro CORRECTO = " + r);
		}else{
			System.out.println("tiro INCORRECTO = " + 0);
			r = 0;
		}
		return r;
	}
	
}
