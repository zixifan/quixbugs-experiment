/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 20:27:01 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LONGEST_COMMON_SUBSEQUENCE;

public class LONGEST_COMMON_SUBSEQUENCE_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      // Undeclared exception!
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("~bO1RZ.4", "kh_k<B`$8u@5");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      assertNotNull(lONGEST_COMMON_SUBSEQUENCE0);
      
      String string0 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "_'DAyWUPEv>/<jZ");
      assertNotNull(string0);
      assertEquals("", string0);
      
      String string1 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("z6Q7Hjv0fN.I2JBc", "z6Q7Hjv0fN.I2JBc");
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertEquals("z6Q7Hjv0fN.I2JBc", string1);
      
      String string2 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("aqs<&RHYiR", "aqs<&RHYiR");
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertEquals("aqs<&RHYiR", string2);
      
      String string3 = null;
      String string4 = "V&[c5wO";
      // Undeclared exception!
      try { 
        LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((String) null, "V&[c5wO");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "");
      assertNotNull(string0);
      assertEquals("", string0);
      
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      assertNotNull(lONGEST_COMMON_SUBSEQUENCE0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = "";
      String string1 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "");
      assertNotNull(string1);
      assertEquals("", string1);
      
      String string2 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "");
      assertNotNull(string2);
      assertEquals("", string2);
      
      String string3 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "");
      assertNotNull(string3);
      assertEquals("", string3);
      
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      assertNotNull(lONGEST_COMMON_SUBSEQUENCE0);
      
      // Undeclared exception!
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("g/)dY~rI", "=aOc'}39r(Bi~");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "]Riu:?HquUi).");
      assertNotNull(string0);
      assertEquals("", string0);
      
      String string1 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("]Riu:?HquUi).", "");
      assertNotNull(string1);
      assertEquals("", string1);
      
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      assertNotNull(lONGEST_COMMON_SUBSEQUENCE0);
      
      String string2 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("$B g`", "$B g`");
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertEquals("$B g`", string2);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = "-gQy&7']B{s.xtn";
      String string1 = "tu?4TNnjU~0j.$'";
      // Undeclared exception!
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence(string0, string1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      assertNotNull(lONGEST_COMMON_SUBSEQUENCE0);
      
      String string0 = "%[bM,";
      String string1 = "";
      String string2 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("%[bM,", "");
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string0));
      assertEquals("", string2);
      
      String string3 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("{0Sf", "{0Sf");
      assertNotNull(string3);
      assertFalse(string3.equals((Object)string2));
      assertFalse(string3.equals((Object)string0));
      assertFalse(string3.equals((Object)string1));
      assertEquals("{0Sf", string3);
      
      String string4 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "");
      assertNotNull(string4);
      assertFalse(string4.equals((Object)string0));
      assertFalse(string4.equals((Object)string3));
      assertEquals("", string4);
      
      String string5 = "m>:i-`}9";
      String string6 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "m>:i-`}9");
      assertNotNull(string6);
      assertFalse(string6.equals((Object)string3));
      assertFalse(string6.equals((Object)string5));
      assertFalse(string6.equals((Object)string0));
      assertEquals("", string6);
      
      String string7 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", "");
      assertNotNull(string7);
      assertFalse(string7.equals((Object)string5));
      assertFalse(string7.equals((Object)string0));
      assertFalse(string7.equals((Object)string3));
      assertEquals("", string7);
      
      String string8 = null;
      String string9 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", (String) null);
      assertNotNull(string9);
      assertFalse(string9.equals((Object)string0));
      assertFalse(string9.equals((Object)string5));
      assertFalse(string9.equals((Object)string3));
      assertEquals("", string9);
      
      String string10 = "PRI*}]:,m6qMP";
      String string11 = "WDw a";
      // Undeclared exception!
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("PRI*}]:,m6qMP", "WDw a");
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String string0 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("/`O1BEc=kFoC_", "/`O1BEc=kFoC_");
      assertNotNull(string0);
      assertEquals("/`O1BEc=kFoC_", string0);
      
      String string1 = "";
      String string2 = null;
      String string3 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("", (String) null);
      assertNotNull(string3);
      assertFalse(string3.equals((Object)string0));
      assertEquals("", string3);
      
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
      assertNotNull(lONGEST_COMMON_SUBSEQUENCE0);
      
      // Undeclared exception!
      try { 
        LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((String) null, "3KWvu");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}