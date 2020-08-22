package libro.cap01;

import java.util.Scanner;

public class DemoMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese cantidad de lineas: ");
		int n =scanner.nextInt();
		System.out.print("Ingrese cantidad de columnas: ");
		int m=scanner.nextInt();
		int mat [][] = new int[n][m];
		int nro;
		scanner.close();
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				nro=(int)(Math.random()*1000);
				mat[i][j]=nro;
			}
		}
		for(int i=0;i<n;i++){
			System.out.print("\n");
			for(int j=0;j<m;j++){
				System.out.print(mat[i][j]+"\t");
			}
		}
	}

}
