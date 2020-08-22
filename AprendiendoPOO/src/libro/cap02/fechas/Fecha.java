package libro.cap02.fechas;

public class Fecha {
	private int dia;
	private int mes;
	private int a�o;
	
	private int fechaToDias(){
		return a�o*360+mes*30+dia;
	}
	private void diasToFecha(int i){
		a�o =(int) i/360;
		int resto = i%360;
		mes = (int)resto/30;
		dia = resto%30;
		if(dia == 0){
			dia=30;
			mes--;
		}
		if(mes == 0){
			mes=12;
			a�o--;
		}
	}
	
	public void addDias(int d){
		int sum = fechaToDias()+d;
		diasToFecha(sum);
	}
	
	public Fecha(String s){
		int pos1 = s.indexOf('/');
		int pos2 = s.lastIndexOf('/');
		String sDia = s.substring(0,pos1);
		dia = Integer.parseInt(sDia);
		String sMes = s.substring(pos1+1,pos2);
		mes = Integer.parseInt(sMes);
		String sA�o = s.substring(pos2+1);
		a�o = Integer.parseInt(sA�o);
	}
	
	public Fecha(int d,int m, int a){
		dia=d;
		mes=m;
		a�o=a;
	}
	public Fecha(){}

	public int getDia(){
		return dia;
	}
	public void setDia(int dia){
		this.dia = dia;
	}
	public int getMes(){
		return mes;
	}
	public void setMes(int mes){
		this.mes = mes;
	}
	public int getA�o(){
		return a�o;
	}
	public void setA�o(int a�o){
		this.a�o = a�o;
	}
	
	public String toString(){
		return dia+"/"+mes+"/"+a�o;
	}	
	public boolean equals(Object o){
		Fecha otra = (Fecha) o;		
		return (dia==otra.dia)&&(mes==otra.mes)&&(a�o==otra.a�o);
	}
}
