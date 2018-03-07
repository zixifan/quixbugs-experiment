/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 22:33:30 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.KNAPSACK;

public class KNAPSACK_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[][] intArray0 = new int[5][3];
      int[] intArray1 = new int[0];
      intArray0[0] = intArray1;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[][] intArray0 = new int[1][4];
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-2072), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(0, (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[][] intArray0 = new int[6][5];
      // Undeclared exception!
      KNAPSACK.knapsack(1764, intArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[][] intArray0 = new int[2][5];
      int[] intArray1 = new int[5];
      intArray1[1] = 117;
      intArray0[0] = intArray1;
      int int0 = KNAPSACK.knapsack(117, intArray0);
      assertEquals(117, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[][] intArray0 = new int[2][5];
      int[] intArray1 = new int[5];
      intArray1[0] = 117;
      intArray0[0] = intArray1;
      KNAPSACK.knapsack(117, intArray0);
  }
}