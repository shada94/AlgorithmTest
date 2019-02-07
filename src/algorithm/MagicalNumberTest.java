package algorithm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagicalNumberTest {

	@Test
	public void magicalnumber() {
		MyJUnitClass test = new MyJUnitClass();
			assertEquals("2H4S",  test.displayMagicalNumber(1, 6));
			assertEquals("2H4S",  test.displayMagicalNumber(6, 1));
			assertEquals(4, test.displayMagicalNumber(1, 6).length() );
			assertEquals(0, test.displayMagicalNumber(1, 1).length() );
			assertEquals("", test.displayMagicalNumber(0, 0));
			assertEquals("", test.displayMagicalNumber(5, 6));
	}
	
			
}
