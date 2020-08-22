package libro.cap01;
import java.util.Scanner;

public class ParOImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un valor: ");
		int v = scanner.nextInt();
		int resto = v%2;
		scanner.close();
		/*if(resto==0){
			System.out.print(v+" es par");
		}else{
			System.out.print(v+" es impar");
		}*/
		String mssg = (resto==0) ?"es par" : "es impar";
		
		System.out.println(v+" "+mssg);

	}

}
