package com.grantgotgame.count_substrings;

import java.beans.Transient;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import junit.framework.Assert;

@SpringBootTest
class CountSubstringsApplicationTests {
	public static CountSubstringsApplication app;
	@BeforeAll
	public static void setUp(){
		app = new CountSubstringsApplication();
	}

	@Test
	void contextLoads() {
	}

	// "cat" does not contain "egg", so return 0
	@Test
	public void countSubstringsTest1(){
		String str = "cat";
		String subStr = "egg";
		int expected = 0;
		Assert.assertEquals(expected, app.countSubstrings(str, subStr));
	}

	// "calendar" contains 1 instance of "lend", so return 1
	@Test
	public void countSubstringsTest2(){
		String str = "calendar";
		String subStr = "lend";
		int expected = 1;
		Assert.assertEquals(expected, app.countSubstrings(str, subStr));
	}

	// "Mississippi" contains 2 instances of "is", so return 2
	@Test
	public void countSubstringsTest3(){
		String str = "Mississippi";
		String subStr = "is";
		int expected = 2;
		Assert.assertEquals(expected, app.countSubstrings(str, subStr));
	}

	// "acatOcatecatElCatoNcat" contains 4 instances of "cat", so return 4
	@Test
	public void countSubstringsTest4(){
		String str = "acat12catecatElCatoNcat";
		String subStr = "cat";
		int expected = 4;
		Assert.assertEquals(expected, app.countSubstrings(str, subStr));
	}

}
