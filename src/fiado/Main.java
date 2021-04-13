package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Informe o nome do cliente: ");
		 String nome = scanner.nextLine();
		 Consumidor consumidor = new Consumidor(nome);
		 
		 System.out.print("Informe o número de telefone do cliente: ");
		 String fone = scanner.nextLine();
		 consumidor.setFone(fone);
		 
		 System.out.print("Informe o valor da compra: ");
		 int fiado = Integer.valueOf(scanner.nextLine());
		 consumidor.registrarFiado(fiado);

		 int total = consumidor.getFiado();

		 if (total > 100) {
			 System.out.println("Cliente " + consumidor.getNome() + " deve: " + total + " e ganhou um brinde!"); 
		 } else { 
			 System.out.println("Cliente " + consumidor.getNome() + " deve: " + total); 
		 }
		 
		 System.out.println("O telefone do cliente é: " + consumidor.getFone());
		 
	}

}
