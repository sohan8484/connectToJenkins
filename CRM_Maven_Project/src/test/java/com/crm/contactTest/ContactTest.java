package com.crm.contactTest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {
		String URL = System.getProperty("url");
		String BROWSER= System.getProperty("browser");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println("execute createContactTEst");
	}
	@Test
	public void editContactTEst() {
		System.out.println("execute editContactTest");
	}
}
