package libro.cap02.fechas;
import java.util.Scanner;

public class TestFecha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese una fecha(dd/mm/aaaaa): ");
		String sFecha = scanner.next();
		Fecha f = new Fecha(sFecha);
		System.out.println("La fecha ingresada es: "+f);
		System.out.print("Ingrese dias a sumar(puede ser negativo): ");
		int diasSum = scanner.nextInt();
		f.addDias(diasSum);
		System.out.println("sumando "+diasSum+" dias, queda: "+f);
		scanner.close();
		
	}

}
