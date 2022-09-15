package AssertionsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPractice {
	//HardAssert
//    @Test
//    public void sample() {
//    	String str="Hello";
//    	Assert.assertEquals(str, "hi");
//    	System.out.println("Hello");
//    	
//    	String str1="hi";
//    	Assert.assertEquals(str1, "hi");
//    	System.out.println("hi");
//    }
	
	//SoftAssert
	    @Test
	    public void sample(){
		SoftAssert soft=new SoftAssert();

		String str="Hello";
		soft.assertEquals(str, "Hello");
		System.out.println("Hello");
		
		String str1="hi";
		soft.assertEquals(str1, "hi");
		System.out.println("hi");
		soft.assertAll();	
	}
	
}
