import java.util.Locale;
import java.util.Scanner;

public class treino {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int produto = i * n;
			System.out.println(i + " x " + n);
		}
		 
		sc.close();
	}

}
