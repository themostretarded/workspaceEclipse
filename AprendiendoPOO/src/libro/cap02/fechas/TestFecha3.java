package libro.cap02.fechas;
import java.util.Scanner;

public class TestFecha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese Fecha1 (dia,mes,año): ");
		int dia = scanner.nextInt();
		int mes = scanner.nextInt();
		int año = scanner.nextInt();
		
		Fecha f1 = new Fecha(dia,mes,año);
		
		System.out.print("Ingrese Fecha2 (dia,mes,año): ");
		dia = scanner.nextInt();
		mes = scanner.nextInt();
		año = scanner.nextInt();
		
		Fecha f2 = new Fecha(dia,mes,año);
		System.out.println("Fecha 1 ="+f1);
		System.out.println("Fecha 2 ="+f2);
		
		if(f1.equals(f2)){
			System.out.println("Son iguales!");
		}else{
			System.out.println("Son diferentes");
		}
		scanner.close();
	}

}
