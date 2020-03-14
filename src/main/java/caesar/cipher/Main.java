package caesar.cipher;

public class Main {
	
	public static void main(String[] args) {
		String message="how are you today";
		int offset=12;
		
		CaesarCipher caesarCipher=new CaesarCipher();
		System.out.println(caesarCipher.cipher(message, offset));

	}

}
