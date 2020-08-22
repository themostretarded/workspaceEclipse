package libro.cap02.fechas;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f = new Fecha();
		f.setDia(2);
		f.setMes(10);
		f.setAño(1970);
		
		System.out.println("Dia= "+f.getDia());
		System.out.println("Mes= "+f.getMes());
		System.out.println("Año= "+f.getAño());
		System.out.println("fecha= "+f);
	}

}
