package AssertionsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsPractice {

//	@Test
//	public void test1() {
//		String str1="Hi";
//		String str2="Hello";
//		Assert.assertEquals(str1, str2);
//	}
	
//	@Test
//	public void test1() {
//		String str1="Hi";
//		String str2="Hello";
//		Assert.assertNotEquals(str1, str2);
//	}
	
//	@Test
//	public void test1() {
//		String str1="product";
//		Assert.assertNull(str1);
//	}
	
	@Test
	public void test1() {
		String str1=null;
		Assert.assertNotNull(str1);  //1
		System.out.println("This is Testing Line");
		Assert.assertEquals(str1, "hi");  //2
	}
	
	
	
	
	
	
	
	
}
