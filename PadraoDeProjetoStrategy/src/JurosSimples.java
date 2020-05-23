
public  class JurosSimples implements JurosDeEmprestimo{

	
	public double juros() {
		int valor1 = 100;
		float juros = 0.02f;
		return (valor1*(1+juros*2));
	}

}
