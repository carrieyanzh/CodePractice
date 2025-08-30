import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;



@Tag("fast")
class FirstTest {

  @Test
  @DisplayName("My 1st JUnit 5 test! 😎")
  void myFirstTest(TestInfo testInfo) {
    Calculator calculator = new Calculator();
    assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
    assertEquals("My 1st JUnit 5 test! 😎", testInfo.getDisplayName(), () -> "TestInfo is injected correctly");
  }

  @Test
  @DisplayName("My 1st JUnit 5 testAddition! 😎")
  void testAddition() {
    Calculator calculator = new Calculator();
    assertAll("Calculator tests",
      () -> {
        System.out.println("Testing 1 + 1");
        assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
      },
      () -> {
        System.out.println("Testing 2 + 3");
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
      }
    );
  }


}
