/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 02:17:24 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.POSSIBLE_CHANGE;

public class POSSIBLE_CHANGE_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[] intArray0 = new int[5];
      int int0 = (-792);
      intArray0[0] = (-792);
      int int1 = 1010;
      intArray0[1] = 1010;
      intArray0[2] = (-2771);
      intArray0[3] = 0;
      intArray0[4] = 372;
      POSSIBLE_CHANGE.possible_change(intArray0, (-792));
      // Undeclared exception!
      try { 
        POSSIBLE_CHANGE.possible_change(intArray0, int1);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      int[] intArray0 = new int[8];
      intArray0[0] = 0;
      intArray0[1] = 0;
      intArray0[2] = 1;
      intArray0[3] = 0;
      intArray0[4] = 0;
      intArray0[5] = (-3915);
      intArray0[6] = 0;
      intArray0[7] = (-1);
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[0];
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, (-1));
      assertEquals(0, int0);
      
      int int1 = POSSIBLE_CHANGE.possible_change(intArray0, 439);
      int int2 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
      assertFalse(int2 == int1);
      
      int int3 = POSSIBLE_CHANGE.possible_change(intArray0, 1);
      assertEquals(0, int3);
  }

//  @Test(timeout = 4000)
//  public void test03()  throws Throwable  {
//      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
//      int[] intArray0 = new int[4];
//      int int0 = 3592;
//      intArray0[0] = 3592;
//      intArray0[1] = 0;
//      intArray0[2] = (-1);
//      intArray0[3] = 0;
//      POSSIBLE_CHANGE.possible_change(intArray0, int0);
//  }

//  @Test(timeout = 4000)
//  public void test04()  throws Throwable  {
//      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
//      assertNotNull(pOSSIBLE_CHANGE0);
//      
//      int[] intArray0 = new int[1];
//      intArray0[0] = 1;
//      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, 1);
//      assertEquals(1, intArray0.length);
//      assertArrayEquals(new int[] {1}, intArray0);
//      assertEquals(1, int0);
//      
//      int int1 = POSSIBLE_CHANGE.possible_change(intArray0, 1);
//      assertEquals(1, intArray0.length);
//      assertTrue(int1 == int0);
//      assertArrayEquals(new int[] {1}, intArray0);
//      assertEquals(1, int1);
//      
//      int int2 = POSSIBLE_CHANGE.possible_change(intArray0, 1);
//      assertEquals(1, intArray0.length);
//      assertTrue(int2 == int1);
//      assertTrue(int2 == int0);
//      assertArrayEquals(new int[] {1}, intArray0);
//      assertEquals(1, int2);
//      
//      int[] intArray1 = new int[5];
//      assertFalse(intArray1.equals((Object)intArray0));
//      
//      intArray1[0] = 1;
//      int int3 = 1;
//      intArray1[1] = 1;
//      intArray1[2] = 0;
//      intArray1[3] = 1;
//      intArray1[4] = 1;
//      POSSIBLE_CHANGE.possible_change(intArray1, int3);
//      POSSIBLE_CHANGE.possible_change(intArray0, intArray1[4]);
//      POSSIBLE_CHANGE.possible_change(intArray0, intArray0[0]);
//      int int4 = 3124;
//      POSSIBLE_CHANGE.possible_change(intArray0, int4);
//      int int5 = (-920);
//      POSSIBLE_CHANGE.possible_change(intArray1, int5);
//  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      assertNotNull(pOSSIBLE_CHANGE0);
      
      int[] intArray0 = new int[3];
      intArray0[0] = (-127);
      intArray0[1] = 1;
      intArray0[2] = (-866);
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, (-127));
      assertEquals(3, intArray0.length);
      assertArrayEquals(new int[] {(-127), 1, (-866)}, intArray0);
      assertEquals(0, int0);
  }

//  @Test(timeout = 4000)
//  public void test06()  throws Throwable  {
//      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
//      assertNotNull(pOSSIBLE_CHANGE0);
//      
//      int[] intArray0 = new int[6];
//      intArray0[0] = 0;
//      intArray0[1] = (-812);
//      intArray0[2] = 0;
//      intArray0[3] = 1;
//      intArray0[4] = (-1);
//      intArray0[5] = 1848;
//      int int0 = 66;
//      POSSIBLE_CHANGE.possible_change(intArray0, int0);
//  }

//  @Test(timeout = 4000)
//  public void test07()  throws Throwable  {
//      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
//      assertNotNull(pOSSIBLE_CHANGE0);
//      
//      int[] intArray0 = new int[3];
//      intArray0[0] = 0;
//      intArray0[1] = (-1);
//      intArray0[2] = 940;
//      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, intArray0[2]);
//      int int1 = 0;
//      POSSIBLE_CHANGE.possible_change(intArray0, int1);
//      POSSIBLE_CHANGE.possible_change(intArray0, int0);
//      int int2 = (-1817);
//      POSSIBLE_CHANGE.possible_change(intArray0, int2);
//      POSSIBLE_CHANGE.possible_change(intArray0, intArray0[1]);
//      int int3 = 0;
//      POSSIBLE_CHANGE.possible_change(intArray0, int3);
//  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      assertNotNull(pOSSIBLE_CHANGE0);
      
      int[] intArray0 = new int[4];
      intArray0[0] = (-1016);
      intArray0[1] = 1;
      intArray0[2] = (-204);
      intArray0[3] = 956;
      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, (-204));
      assertEquals(4, intArray0.length);
      assertArrayEquals(new int[] {(-1016), 1, (-204), 956}, intArray0);
      assertEquals(0, int0);
  }

//  @Test(timeout = 4000)
//  public void test09()  throws Throwable  {
//      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
//      assertNotNull(pOSSIBLE_CHANGE0);
//      
//      int[] intArray0 = new int[7];
//      intArray0[0] = 0;
//      intArray0[1] = 0;
//      intArray0[2] = 0;
//      intArray0[3] = 1;
//      intArray0[4] = 26;
//      intArray0[5] = (-1);
//      intArray0[6] = 743;
//      int int0 = POSSIBLE_CHANGE.possible_change(intArray0, (-1));
//      assertEquals(7, intArray0.length);
//      assertArrayEquals(new int[] {0, 0, 0, 1, 26, (-1), 743}, intArray0);
//      assertEquals(0, int0);
//      
//      int int1 = POSSIBLE_CHANGE.possible_change(intArray0, (-1));
//      assertEquals(7, intArray0.length);
//      assertTrue(int1 == int0);
//      assertArrayEquals(new int[] {0, 0, 0, 1, 26, (-1), 743}, intArray0);
//      assertEquals(0, int1);
//      
//      int int2 = POSSIBLE_CHANGE.possible_change(intArray0, 0);
//      assertEquals(7, intArray0.length);
//      assertFalse(int2 == int1);
//      assertFalse(int2 == int0);
//      assertArrayEquals(new int[] {0, 0, 0, 1, 26, (-1), 743}, intArray0);
//      assertEquals(1, int2);
//      
//      int int3 = POSSIBLE_CHANGE.possible_change(intArray0, (-1));
//      assertEquals(7, intArray0.length);
//      assertFalse(int3 == int2);
//      assertTrue(int3 == int1);
//      assertTrue(int3 == int0);
//      assertArrayEquals(new int[] {0, 0, 0, 1, 26, (-1), 743}, intArray0);
//      assertEquals(0, int3);
//      
//      int[] intArray1 = new int[0];
//      assertFalse(intArray1.equals((Object)intArray0));
//      
//      int int4 = POSSIBLE_CHANGE.possible_change(intArray1, 26);
//      assertEquals(0, intArray1.length);
//      assertFalse(intArray1.equals((Object)intArray0));
//      assertTrue(int4 == int3);
//      assertTrue(int4 == int0);
//      assertTrue(int4 == int1);
//      assertFalse(int4 == int2);
//      assertArrayEquals(new int[] {}, intArray1);
//      assertEquals(0, int4);
//      assertNotSame(intArray1, intArray0);
//      
//      int int5 = POSSIBLE_CHANGE.possible_change(intArray0, (-1));
//      assertEquals(7, intArray0.length);
//      assertFalse(intArray0.equals((Object)intArray1));
//      assertTrue(int5 == int0);
//      assertTrue(int5 == int4);
//      assertFalse(int5 == int2);
//      assertTrue(int5 == int1);
//      assertTrue(int5 == int3);
//      assertArrayEquals(new int[] {0, 0, 0, 1, 26, (-1), 743}, intArray0);
//      assertEquals(0, int5);
//      assertNotSame(intArray0, intArray1);
//      
//      int int6 = 1;
//      int int7 = POSSIBLE_CHANGE.possible_change(intArray0, int6);
//      POSSIBLE_CHANGE.possible_change(intArray1, int1);
//      POSSIBLE_CHANGE.possible_change(intArray0, int3);
//      int int8 = 0;
//      POSSIBLE_CHANGE.possible_change(intArray0, int8);
//      POSSIBLE_CHANGE.possible_change(intArray0, int7);
//      POSSIBLE_CHANGE.possible_change(intArray1, intArray0[6]);
//      int int9 = (-2991);
//      POSSIBLE_CHANGE.possible_change(intArray0, int9);
//      int int10 = (-1530);
//      POSSIBLE_CHANGE.possible_change(intArray0, int10);
//  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      POSSIBLE_CHANGE pOSSIBLE_CHANGE0 = new POSSIBLE_CHANGE();
      assertNotNull(pOSSIBLE_CHANGE0);
      
      // Undeclared exception!
      try { 
        POSSIBLE_CHANGE.possible_change((int[]) null, 808);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
