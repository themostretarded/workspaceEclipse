package libro.cap02.fechas;
import java.util.Scanner;

public class TestFecha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese Fecha1 (dia,mes,a�o): ");
		int dia = scanner.nextInt();
		int mes = scanner.nextInt();
		int a�o = scanner.nextInt();
		
		Fecha f1 = new Fecha(dia,mes,a�o);
		
		System.out.print("Ingrese Fecha2 (dia,mes,a�o): ");
		dia = scanner.nextInt();
		mes = scanner.nextInt();
		a�o = scanner.nextInt();
		
		Fecha f2 = new Fecha(dia,mes,a�o);
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
