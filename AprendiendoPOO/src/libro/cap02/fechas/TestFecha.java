package libro.cap02.fechas;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f = new Fecha();
		f.setDia(2);
		f.setMes(10);
		f.setA�o(1970);
		
		System.out.println("Dia= "+f.getDia());
		System.out.println("Mes= "+f.getMes());
		System.out.println("A�o= "+f.getA�o());
		System.out.println("fecha= "+f);
	}

}
