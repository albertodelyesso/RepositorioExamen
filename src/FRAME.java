import java.util.ArrayList;

public class FRAME {

	private ArrayList lista = new ArrayList();
	
	public void FRAME(){
		for (int i = 0; i < 2; i++){
			lista.add(0);
		}
	}
	
	
	public boolean realizarTiro(int pinos) {
		// TODO Auto-generated method stub
		boolean r = false;	
		
		if (pinos >= 0 && pinos < 11){
			this.lista.add(pinos);
			r = true;
			System.out.println("primer tiro CORRECTO");
		}else{
			System.out.println("primer tiro INCORRECTO");
		}
		return r;
	}
	
}
