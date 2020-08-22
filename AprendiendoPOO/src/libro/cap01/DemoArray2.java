package libro.cap01;
import java.util.Scanner;
public class DemoArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dias[]={"Lunes","Martes","Miercoles",
				"Jueves","Sabado","Domingo"};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa un dia de la semana(numero): ");
		int v = scanner.nextInt();
		scanner.close();
		if(v<=dias.length){
			System.out.print(dias[v-1]);
		}else{
			System.out.print("Dia incorreto....");
		}
	}

}
