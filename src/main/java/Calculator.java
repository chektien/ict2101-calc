public class Calculator {
  public int evaluate(String expression) {
    int sum = 0;

    // a new comment
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}
