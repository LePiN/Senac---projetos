package br.sc.senac.aula07;

public class Exemplo02_consoles {
	
	public String nome;
	public String geracao;
	public String fabricante;
	public double preco;
	public int anoLancamento;
	
	public Exemplo02_consoles(String nome, String geracao, String fabricante, double preco, int anoLancamento) {
		super();
		this.nome = nome;
		this.geracao = geracao;
		this.fabricante = fabricante;
		this.preco = preco;
		this.anoLancamento = anoLancamento;
	}

	public Exemplo02_consoles() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGeracao() {
		return geracao;
	}

	public void setGeracao(String geracao) {
		this.geracao = geracao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	
	
	
}
