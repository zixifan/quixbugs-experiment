/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 05 23:19:26 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LEVENSHTEIN;

public class LEVENSHTEIN_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LEVENSHTEIN lEVENSHTEIN0 = new LEVENSHTEIN();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = LEVENSHTEIN.levenshtein("#6LQ~Wxs?2'yQZ]@", "h2h");
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        LEVENSHTEIN.levenshtein((String) null, "r");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

//  @Test(timeout = 4000)
//  public void test3()  throws Throwable  {
//      // Undeclared exception!
//      LEVENSHTEIN.levenshtein("OuRCp^GHTe", "vpz0]r6}?LTB9");
//  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int int0 = LEVENSHTEIN.levenshtein("h2h", "h2h");
      assertEquals(0, int0);
  }
}
