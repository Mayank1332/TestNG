package com.TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	 @BeforeClass
	  public void beforeClass() {
	    System.out.println("Before class");
	 }
	 @BeforeMethod
	  public void beforeMethod() {
	    System.out.println("Before Method...");
	 }
	@Test
	public void testHello1() {
		System.out.println("Hello TestNG 1");
	}
	@Test
	public void testHello2() {
		System.out.println("Hello TestNG 2");
	}
	
	 @AfterMethod
	  public void afterMethod() {
	    System.out.println("After Method...");
	 }
	 @AfterClass
	  public void afterClass() {
	    System.out.println("After Class...");
	 }

}
