package libro.cap01;
import java.util.Scanner;

public class Cadenas8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese una cadena: ");
		String s1 = scanner.next();
		System.out.print("\nIngrese otra cadena: ");
		String s2 = scanner.next();
		System.out.println("s1 = [ "+ s1 +" ] ");
		System.out.println("s2 = [ "+ s2 +" ] ");
		scanner.close();
		if(s1 ==s2){
			System.out.println("iguales");
		}else{
			System.out.println("diferencte");
		}
	}

}
