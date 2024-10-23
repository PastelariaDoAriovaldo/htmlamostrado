package lista_de_exercicio;

public class Principal2 {

	public static void main(String[] args) {

		ContaBancaria contabancaria = new ContaBancaria("USP", 23);
		Cliente cliente = new Cliente("Joao");
		System.out.println("cliente: " + cliente.getNome()
		+ "\ncontabancaria: " + contabancaria.getNumero());

	}

}
