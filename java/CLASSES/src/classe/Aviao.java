package classe;

public class Aviao {
	private int ano;
	private boolean ativo;
	private char companhia;//1 - Gol, 2- azul, 3 - latam
	private String nome;
	
	
	
	
	public Aviao(int ano, boolean ativo, char companhia, String marca) {
		super();
		this.ano = ano;
		this.ativo = ativo;
		this.companhia = companhia;
	}
	public int tempoDeAtividade() {
		return (2021 - ano);
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public char getCompanhia() {
		return companhia;
	}
	public void setCompanhia(char companhia) {
		this.companhia = companhia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int tempoDeAtividade(int anoAtual) {		
		return (anoAtual - this.ano);
	}
	
	public String companhiaAerea() {
		String resposta = "";
		if (this.companhia == '1') {
			resposta = "Gol";
		} 
		else if(this.companhia == '2') {
			resposta = "Azul";
		} 
		else if (this.companhia == '3') {
			resposta = "Latam";
		} else {
			resposta = "Outra";
		}
		return resposta;
		
	}
	
	public String marca() {
		String resposta = " ";
		System.out.println("Modelo Air-771");
		return resposta;
	}
	
	public void ativo() {
		System.out.println("Status do avião ativo, documentação em ordem!");
	}
	public void inativo() {
		System.out.println("Status do avião inativo, falta de documentação!");
		ativo = false;
	}
	
	
}
