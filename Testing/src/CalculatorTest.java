import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private static Calculator calculator;
	
	@Test  
	public void testFindMax(){  
		assertEquals(4,calculator.findMax(1,3,4));  
		assertEquals(-1,calculator.findMax(-12,-1,-2));  
	} 
	@Test  
	public void testSquare1(){  
		assertEquals(9,calculator.square(3));  
	}
	@Test 
	public void testSquare2(){  
		calculator.square(-1);  
	}
	@Test  
	public void testCube(){  
		assertEquals(27,calculator.cube(3));  
	}
	  
}



