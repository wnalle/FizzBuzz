import org.junit.Test;


import static org.junit.Assert.assertEquals;

/**
 * Test class for FizzBuzz.
 */
public class FizzBuzzTest {

  /**
   * Test the fizz buzz method with values of 5, 15, 93 and 2.
   * @throws Exception Failed to call fizz buzz method correctly.
   */
  @Test
  public void testFizzBuzzCompute() throws Exception {
    assertEquals("Testing FizzBuzz for 5", "Buzz", FizzBuzz.fizzBuzzCompute(5));
    assertEquals("Testing FizzBuzz for 15", "FizzBuzz", FizzBuzz.fizzBuzzCompute(15));
    assertEquals("Testing FizzBuzz for 93", "Fizz", FizzBuzz.fizzBuzzCompute(93));
    assertEquals("Testing FizzBuzz for 2", "2", FizzBuzz.fizzBuzzCompute(2));
  }
}