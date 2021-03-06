/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 00:47:45 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.SQRT;

public class SQRT_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SQRT sQRT0 = new SQRT();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = SQRT.sqrt(0.0, (-1532.0));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      SQRT.sqrt((-553.074276810094), (-553.074276810094));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = SQRT.sqrt((-1.0), 1033.503435468039);
      assertEquals((-0.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = SQRT.sqrt(823.493515709, 823.493515709);
      assertEquals(35.58174589751816, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      double double0 = SQRT.sqrt(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }
}
