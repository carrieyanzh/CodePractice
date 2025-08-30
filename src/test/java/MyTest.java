import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyTest {
  @Test
  void exampleTest() {
    boolean condition = "true".equalsIgnoreCase(System.getProperty("runTest"));
    Assumptions.assumeTrue(condition, "Skipping the test because the condition is not met");
    int result = someMethod();
    Assertions.assertEquals(42, result, "The result should be 42");
  }

  private int someMethod() {
    return 42;
  }

  @ParameterizedTest
  @ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
  void palindromes(String candidate) {
    assertTrue(isPalindrome(candidate));
  }

  public static boolean isPalindrome(String s) {

    // Convert string to lowercase for
    // case-insensitive comparison
    s = s.toLowerCase();

    // Reverse the string
    String rev = "";
    for (int i = s.length() - 1; i >= 0; i--) {
      rev = rev + s.charAt(i);
    }

    // Compare the original string with
    // the reversed string
    return s.equals(rev);
  }
}
