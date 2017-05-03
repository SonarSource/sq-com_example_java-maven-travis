package foo;
// changes for Jenkin

import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

  @Test
  public void testAdd() throws Exception {
  	assertEquals(Foo.div(10, 5), 2);
  }
}
