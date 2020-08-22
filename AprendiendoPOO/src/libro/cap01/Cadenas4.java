package libro.cap01;

public class Cadenas4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "un buen libro de java";
		boolean b1 = s.startsWith("un buen");
		boolean b2 = s.startsWith("a");
		boolean b3 = s.endsWith("java");
		boolean b4 = s.endsWith("chau");
		System.out.println(b1+"\n"+b2+"\n"+b3+"\n"+b4);
	}

}
