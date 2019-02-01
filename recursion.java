public class recursion{
  public static double sqrt(double n, double tolerance){
    return recursion.sqrtHelper(n, 1.0, tolerance);
  }
  private static double sqrtHelper(double n, double guess, double tolerance){
    double newGuess = (n / guess + guess) / 2.0;
    double accurate = (Math.abs(n - (guess * guess))) / n;
    if (accurate > tolerance){
      return sqrtHelper(n, newGuess, tolerance);
    }else{
      return newGuess;
    }
  }
}
