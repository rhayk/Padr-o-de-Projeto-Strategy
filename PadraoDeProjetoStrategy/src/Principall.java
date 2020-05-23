
public class Principall  {
	
	public static void main(String[] args) {
		
		System.out.println("O juros simples é:"+TipoJuros.JurosSimples.obterJuros().juros());
		System.out.println("O juros composto é: " +TipoJuros.JurosCompostos.obterJuros().juros());
	
	}

}
