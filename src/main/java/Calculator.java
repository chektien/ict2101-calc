public class Calculator {
  public int evaluate(String expression) {
    int sum = 0;

    // a new comment (this is DEV2's addition)
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}
