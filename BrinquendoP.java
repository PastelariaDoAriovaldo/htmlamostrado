package lista;

public class BrinquendoP {

	public static void main(String[] args) {
		
		
		Carro corvette = new Carro ("Vermelho","Controle Remoto","McQueen Carros",25);
		System.out.println("CARRO: ");
		System.out.println(corvette.getCor());
		System.out.println(corvette.getTipo());
		System.out.println(corvette.getNome());
		System.out.println(corvette.getVelocidade());
		corvette.Mover();
		
		System.out.println("");
		
		Moto kawasaki = new Moto ("Verde","Fricção","Z1000 Kawasaki",20);
		System.out.println("MOTO: ");
		System.out.println(kawasaki.getCor());
		System.out.println(kawasaki.getTipo());
		System.out.println(kawasaki.getNome());
		System.out.println(kawasaki.getVelocidade());
		kawasaki.Mover();
		
		System.out.println("");
		
		Navio titanic = new Navio ("Roxo","Controle Remoto","Songamonga SS Cruzeiros",15);
		System.out.println("NAVIO: ");
		System.out.println(titanic.getCor());
		System.out.println(titanic.getTipo());
		System.out.println(titanic.getNome());
		System.out.println(titanic.getVelocidade());
		titanic.Mover();
		

	}

}
