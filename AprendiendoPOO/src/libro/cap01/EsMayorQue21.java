package libro.cap01;
import java.util.Scanner;

public class EsMayorQue21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese su edad ");
		int edad = scanner.nextInt();
		scanner.close();
		if(edad>=21){
			System.out.println("ud. es mayor de edad");
		}else{
			System.out.println("ud. es menor de edad");
		}

	}

}
