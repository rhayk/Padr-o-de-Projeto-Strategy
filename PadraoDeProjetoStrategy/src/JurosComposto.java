
public class JurosComposto implements JurosDeEmprestimo{


	public double juros() {
		int valor1 = 100;
		float juros = 0.02f;
		int parcela = 2;
		double valorr;

		return (valor1*(Math.pow(1+juros, parcela))) ;
	
	}   
	 
	
	
}


