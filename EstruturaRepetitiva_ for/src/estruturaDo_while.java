import java.util.Locale;
import java.util.Scanner;

public class estruturaDo_while {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Celsius: ");
		
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32;
		
		System.out.printf("Equivalente Fahrenheit: %.1f%n", F);
		System.out.print("Deseja repetir (s/n)?");
		
		char resp = sc.next().charAt(0);
		
		while (resp != 'n') {
			System.out.print("Digite a temperatura em Celsius: ");
			
			C = sc.nextDouble();
			F = 9.0 * C / 5.0 + 32;
			
			System.out.printf("Equivalente Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)?");
			
			resp = sc.next().charAt(0);
		}
		
		// Essa versão executa o programa de forma irregular, copiando os mesmos padrões dentro do while !!!
		
		sc.close();
	}

}
