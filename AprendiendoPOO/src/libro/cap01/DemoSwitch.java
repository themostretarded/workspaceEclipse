package libro.cap01;
import java.util.Scanner;

public class DemoSwitch {
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el dia dela semana");
		int v= scanner.nextInt();
		String dia;
		scanner.close();
		switch(v){
		case 1:
			dia="Lunes";
			break;
		case 2:
			dia="Martes";
			break;
		case 3:
			dia="Miercoles";
			break;
		case 4:
			dia="Jueves";
			break;
		case 5:
			dia="Viernes";
			break;
		case 6:
			dia="Sabado";
			break;
		case 7:
			dia="Domingo";
			break;
		default:
			dia ="Dia incorrecto... Elvalor debe ser entre 1 a 7";
		}
		System.out.println(dia);
	}

}
