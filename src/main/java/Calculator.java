public class Calculator {
  public int evaluate(String expression) {
    int sum = 0;

    // a new comment (I am the OWNER)
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand);
    return sum;
  }
}
