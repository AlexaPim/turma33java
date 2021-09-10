package entities;

public class ContaEstudantil extends Conta{
	
		//atributo
		private double limiteEstudantil;
		private double usedLimit = 0.0;
		
		//construtor
		public ContaEstudantil(int numero, String cpf, double limiteEstudantil) {
			super(numero, cpf);
			this.limiteEstudantil = limiteEstudantil;
		}

		//encapsulamento
		public double getLimiteEstudantil() {
			return limiteEstudantil;
		}

		public void setLimiteEstudantil(double limiteEstudantil) {
			this.limiteEstudantil = limiteEstudantil;
		}
		
		//metodos
		
		public String getAccountType() {
			return "estudantil";
		}
		
		public void usarEstudantil(double valor) {
			if (valor == 0) {
				System.out.println("Por favor, informe um valor que seja possível realizar");
			}
			else if(valor < 0) {
				System.out.println("Valor informado negativo, impossivel realizar...");
			} 
			else if (valor > this.limiteEstudantil) {
				System.out.println("Limite ultrapassado, impossível realizar.");
			}
			else if((this.usedLimit + valor) > 5000) {
				System.out.println("Valor maior que o limite disponível.");
			}
			else {
				this.usedLimit += valor; 
				this.limiteEstudantil = this.limiteEstudantil - valor;
				credito(valor);
				
			}
			
			
			
		}
		
		
	
}
