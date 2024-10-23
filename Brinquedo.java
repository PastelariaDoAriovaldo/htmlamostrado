package lista;

public class Brinquedo {
	
	private String cor,tipo,nome;
	private int velocidade;
	
	public Brinquedo (String cor,String tipo,String nome,int velocidade) {
		this.cor=cor;
		this.tipo=tipo;
		this.nome=nome;
		this.velocidade=velocidade;
	}
	public void Mover() {
		System.out.println("Movendo");
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
}
