/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 14:19:29 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.FIND_FIRST_IN_SORTED;

public class FIND_FIRST_IN_SORTED_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FIND_FIRST_IN_SORTED fIND_FIRST_IN_SORTED0 = new FIND_FIRST_IN_SORTED();
      int[] intArray0 = new int[12];
      intArray0[1] = (-2047);
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, (-2047));
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, (-576));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[3];
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[9];
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[1] = 1707;
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, 1707);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[0];
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, (-459));
      FIND_FIRST_IN_SORTED fIND_FIRST_IN_SORTED0 = new FIND_FIRST_IN_SORTED();
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, (-2366));
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, (-1));
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, (-1));
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, (-1));
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, 0);
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray0, (-950));
      int[] intArray1 = new int[0];
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray1, (-459));
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray1, 0);
      FIND_FIRST_IN_SORTED.find_first_in_sorted(intArray1, (-1));
      FIND_FIRST_IN_SORTED.find_first_in_sorted((int[]) null, 49);
  }
}