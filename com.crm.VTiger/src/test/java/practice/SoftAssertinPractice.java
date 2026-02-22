package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertinPractice {
	String expected="abc";
	String actual="abc1";
	@Test
	public void StricSoftAssertionprctice() {
		System.out.println("Start");
		SoftAssert s=new SoftAssert();
		s.assertEquals(actual, expected);
		System.out.println("End");
		s.assertAll();
		}
	@Test
	public void ContainsSoftAssertionprctice() {
		System.out.println("Start");
		SoftAssert s=new SoftAssert();
		s.assertEquals(expected, actual);
		System.out.println("End");
		s.assertAll();
		}

}
