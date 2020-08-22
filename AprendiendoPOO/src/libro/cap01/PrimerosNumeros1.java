package libro.cap01;

import java.util.Scanner;

public class PrimerosNumeros1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int i=1;
		scanner.close();
		while(i <=n){
			System.out.print(i);
			i++;
		}
	}

}
