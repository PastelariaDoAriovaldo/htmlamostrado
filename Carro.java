package lista;

public class Carro extends Brinquedo {
	
	public Carro(String cor, String tipo, String nome, int velocidade) {
		super(cor,tipo,nome,velocidade);
	}
	@Override
	public void Mover(){
		System.out.println("Acelerando");
		
	}
	

}
