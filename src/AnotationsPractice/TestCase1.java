package AnotationsPractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	@BeforeTest
    public void OpenDB() {
    	System.out.println("Database is open");
    }
    @AfterTest
    public void CloseDB() {
    	System.out.println("Database is closed");
    }
    
	@Test
	public void m1() {
		System.out.println("This is method m1");
	}
	@Test
	public void m2() {
		System.out.println("This is method m2");
	}
	@Test
	public void m3() {
		System.out.println("This is method m3");
	}
	
	
	
	
	
	
}
