package libro.cap01;

public class Cadenas7s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Juan|Marcos|Carlos|Matias";
		String [] tokens = s.split("[|]");
		System.out.println(tokens);
		for(int i=0;i<tokens.length;i++){
			System.out.println(tokens[i]);
		}
	}

}
