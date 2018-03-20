/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 11:44:52 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.WRAP;

public class WRAP_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WRAP wRAP0 = new WRAP();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[4];
      WRAP.main(stringArray0);
      assertEquals(4, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        WRAP.wrap("", (-390));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<String> arrayList0 = WRAP.wrap("", 341);
      assertFalse(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<String> arrayList0 = WRAP.wrap(") ", 1);
      assertFalse(arrayList0.contains(") "));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        WRAP.wrap((String) null, (-437));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

//  @Test(timeout = 4000)
//  public void test6()  throws Throwable  {
//      // Undeclared exception!
//      WRAP.wrap("Bx}C7)^p =1UDSmz", 1);
//  }
}
