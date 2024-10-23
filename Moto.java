package lista;

public class Moto extends Brinquedo {
	
	public Moto(String cor, String tipo, String nome, int velocidade) {
		super(cor,tipo,nome,velocidade);
	}
	@Override
	public void Mover(){
		System.out.println("Dando Grau");
		
	}
	

}
