package coisas;

public class Situacao {
	public String NossoNumero = "";
	public Double Valor = 0.0;
	private String Situacao = "Aberto";
	
	//Método que expoe o valor da situacao
		//Nome genérico é getter
		
		public String getSituacao() {
			return this.Situacao;
		}
		
		public void setSituacao(String novasituacao) throws Exception {
			if(this.Situacao.equalsIgnoreCase("aberto" ) 
					&& (novasituacao.equalsIgnoreCase("cancelado") 
					|| novasituacao.equalsIgnoreCase("fechado")
					|| novasituacao.equalsIgnoreCase("aberto"))){
						this.Situacao = novasituacao;
					}
					else {
						if(this.Situacao.equalsIgnoreCase("fechado" )
								&& (novasituacao.equalsIgnoreCase("cancelado")
								|| novasituacao.equalsIgnoreCase("fechado"))) {
							this.Situacao = novasituacao;
						}
						else {
							if(this.Situacao.equalsIgnoreCase("cancelado" )
									&& !novasituacao.equalsIgnoreCase("cancelado")) {
								throw new Exception("Se fodeu");
							}
						}
					}
		}
	
	

}
