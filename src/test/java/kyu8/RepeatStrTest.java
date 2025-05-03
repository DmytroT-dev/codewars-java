package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepeatStrTest {
  @Test
  public void test4a() {
    assertEquals("aaaa", RepeatStr.repeatStr(4, "a"));
  }

  @Test
  public void test3Hello() {
    assertEquals("HelloHelloHello", RepeatStr.repeatStr(3, "Hello"));
  }

  @Test
  public void test5empty() {
    assertEquals("", RepeatStr.repeatStr(5, ""));
  }

  @Test
  public void test0kata() {
    assertEquals("", RepeatStr.repeatStr(0, "kata"));
  }

  @Test
  public void test0empty() {
    assertEquals("", RepeatStr.repeatStr(0, ""));
  }

  @Test
  public void test6I() {
    assertEquals("IIIIII", RepeatStr.repeatStr(6, "I"));
  }

  @Test
  public void test5Hello() {
    assertEquals("HelloHelloHelloHelloHello", RepeatStr.repeatStr(5, "Hello"));
  }
}