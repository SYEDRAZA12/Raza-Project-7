package unitTesting;
import org.junit.Assert;

public class TestCalculator {

	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		int total = cal.addition(5, 6);
		Assert.assertEquals(total, 11);
		System.out.println(total);
		
	}

}
