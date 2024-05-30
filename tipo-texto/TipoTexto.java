import java.util.Scanner;

public class TipoTexto {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu primeiro nome: ");
	
		String nome1 = scanner.nextLine();
		
		System.out.print("Agora digite seu segundo nome: ");
		String nome2 = scanner.nextLine();
		
		System.out.println("Olá " + nome1 + " " + nome2 + "!");
		
		scanner.close();
		
	}

}
