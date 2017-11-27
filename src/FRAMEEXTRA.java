
public class FRAMEEXTRA extends FRAME {

	
	
	public FRAMEEXTRA() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public boolean soyExtra(){
		return true;
	}
	
	
	public int realizarSegundoTiro(int pinos) {
		// TODO Auto-generated method stub
		int r = pinos;	
		int quedan = 10 -this.getPrimero();
		if (pinos >= 0 && quedan >= 10){
			//buen valor
			this.setSegundo(pinos);
		}else{
			//mal valor
			r = 0;
		}
		return r;
	}
	

}
