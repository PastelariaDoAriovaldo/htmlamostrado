package lista;

public class Navio extends Brinquedo {
	
	public Navio(String cor, String tipo, String nome, int velocidade) {
		super(cor,tipo,nome,velocidade);
	}
	@Override
	public void Mover(){
		System.out.println("Navegando");
		
	}
	

}
