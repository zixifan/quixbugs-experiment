/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 04 19:44:15 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.KHEAPSORT;

public class KHEAPSORT_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KHEAPSORT kHEAPSORT0 = new KHEAPSORT();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      // Undeclared exception!
      try { 
        KHEAPSORT.kheapsort(arrayList0, (-510));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fromIndex(0) > toIndex(-510)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      // Undeclared exception!
      try { 
        KHEAPSORT.kheapsort(arrayList0, 3328);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // toIndex = 3328
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        KHEAPSORT.kheapsort((ArrayList<Integer>) null, (-647));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Integer> arrayList1 = KHEAPSORT.kheapsort(arrayList0, 0);
      assertNotSame(arrayList1, arrayList0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      Integer integer1 = new Integer(0);
      arrayList0.add(integer1);
      ArrayList<Integer> arrayList1 = KHEAPSORT.kheapsort(arrayList0, 1);
      assertEquals(2, arrayList0.size());
      assertTrue(arrayList1.equals((Object)arrayList0));
  }
}