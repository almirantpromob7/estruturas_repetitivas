import java.util.Locale;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Exercício Tabuada.
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= 10;i++) {
			int produto = i * N;
			System.out.println(i +" x "+ N +" = "+ produto);
		}
		
		sc.close();
	}

}
