public class Calculator {
  public int evaluate(String expression) {
    int sum = 0;

    // a new comment (I am the OWNER but I also include DEV2)
    for (String summand: expression.split("\\+"))
      sum += Integer.valueOf(summand) + 1;
    return sum;
  }
}
