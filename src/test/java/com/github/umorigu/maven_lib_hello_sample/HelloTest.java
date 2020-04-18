package com.github.umorigu.maven_lib_hello_sample;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
  @Test
  void testGetMessage() {
    Hello hello = new Hello();
    assertEquals("Hello, world! v0.0.1", hello.getMessage());
  }
}
