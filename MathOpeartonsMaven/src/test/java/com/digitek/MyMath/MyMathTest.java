package com.digitek.MyMath;

import org.junit.Test;
import org.junit.Assert;
//import org.junit.Ignore;

//import junit.framework.Assert;

public class MyMathTest {
	@Test
	public void MyMathTest_test (){
		AddWithPassingValue  mo = new AddWithPassingValue();
		int actualResult = mo.myAdd(10,20);
		Assert.assertEquals(30, actualResult);
	}
	
	
     
}
