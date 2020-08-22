package libro.cap01;
import java.util.Scanner;

public class PrimerosNumeros2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int i = 1;
		scanner.close();
		do{
			System.out.print(i);
			i++;
			}
		while(i<=n);
	}

}
