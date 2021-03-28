package _02_More_Algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 * **/

public class _00_MoreAndMoreTests {
	  public String multiply(int num, int num2) {
		  int product = num * num2;
		  return num+" x "+num2+" = "+product;
	  }
	  
	@Test
	  public void MultTest() {

	    assertEquals("10 x 0 = 0", multiply(10, 0));
	    assertEquals("10 x 10 = 100", multiply(10, 10));
	    assertEquals("8 x 11 = 88", multiply(8, 11));
	  }
/////
	  public boolean isPrime(int num) {
		  boolean isPrime = false;
		  for(int i=1;i<num+1;i++) {
			  if(i!=1&&i!=num) {
				  if(num%i==0) {
					  isPrime = false;
					  break;
				  }
			  }else {
				  isPrime = true;
			  }
		  }
		  return isPrime;
	  }
	  
	@Test
	  public void PrimeTest() {

	    assertTrue(isPrime(3));
	    assertTrue(isPrime(5));
	    assertTrue(isPrime(541));
	    assertFalse(isPrime(4));
	    assertFalse(isPrime(12));
	    assertFalse(isPrime(527));

	  }
//
	 public boolean isSquare(int num) {
		  boolean isSquare = false;
		  if(Math.sqrt(num)%1==0) {
			  isSquare = true;
		  }
		  return isSquare;
	  }
	  
	@Test
	  public void SquareTest() {

	    assertTrue(isSquare(4));
	    assertTrue(isSquare(144));
	    assertTrue(isSquare(64));
	    assertTrue(isSquare(10201));
	    assertTrue(isSquare(1));
	    assertFalse(isSquare(3));
	    assertFalse(isSquare(22));
	    assertFalse(isSquare(143));

	  }
//
	  public boolean isCube(int num) {
		  boolean isCube = false;
		  if(Math.cbrt(num)%1==0) {
			  isCube = true;
		  }
		  return isCube;
	  }
	  
	@Test
	  public void CubeTest() {

	    assertTrue(isCube(27));
	    assertTrue(isCube(216));
	    assertTrue(isCube(729));
	    assertTrue(isCube(1));
	    assertFalse(isCube(3));
	    assertFalse(isCube(22));
	    assertFalse(isCube(143));

	  }

}
