 package caesar.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {
	private CaesarCipher c=new CaesarCipher();
	@Test
	void testwithOffset12() {
		assertEquals("tai mdq kag fapmk",c.cipher("how are you today",12));
	}
	@Test
	void testEmptyString() {
		assertEquals("",c.cipher("",12));
	}
//	@Test
//	void testwithOffset11() {
//		assertEquals("tai mdq kag fapmk",c.cipher("how are you today",11));
//	}

}
