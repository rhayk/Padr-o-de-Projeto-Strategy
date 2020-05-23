
public enum TipoJuros {

	JurosSimples{
		@Override
		public JurosDeEmprestimo obterJuros() {
			return new JurosSimples();
		}
	},
	
	JurosCompostos{
		
		@Override
		public JurosDeEmprestimo obterJuros() {
			return new JurosComposto();
			
		}
	};
	public abstract JurosDeEmprestimo obterJuros();
	
}
