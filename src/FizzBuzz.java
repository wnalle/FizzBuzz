/**
 * Created by wgnalle on 2/4/2015.
 */

public class FizzBuzz {

  /**
   * Runs the fizz buzz algorithm for values of 1 to 100.
   * @param args Ignored.
   */
  public static void main(String[] args) {

    for (int i = 1; i <= 100; i++) {
      System.out.println(fizzBuzzCompute(i));
    }
  }

  /**
   * Runs the fizz buzz algorithm for a single value.
   * @param valueToCompute The value to run the algorithm on.
   * @return integer value mapped to string according to fizz buzz algorithm.
   */
  public static String fizzBuzzCompute(int valueToCompute) {
    if (valueToCompute % 3 == 0 && valueToCompute % 5 == 0) {
      return "FizzBuzz";
    }
    else if (valueToCompute % 3 == 0) {
      return "Fizz";
    }
    else if (valueToCompute % 5 == 0) {
      return "Buzz";
    }
    else {
      return String.valueOf(valueToCompute);
    }
  }
}
