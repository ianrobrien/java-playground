package no.obrien.playground;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestPlayground {

  @Test
  void testMyMethodReturnsTrue() {
    Playground playground = new Playground();
    assertTrue(playground.myMethod());
  }
}
