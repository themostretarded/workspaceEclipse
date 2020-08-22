package libro.cap01;
import java.util.Scanner;

public class HolaMundoNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre edad y altura: ");
		
		String nom =scanner.nextLine();
		int edad = scanner.nextInt();
		double altura = scanner.nextDouble();
		
		scanner.close();
		System.out.println("hola mundo "+nom+
							" edad "+ edad+
							" altura "+altura);
		

	}

}
