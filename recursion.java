import java.util.ArrayList;
public class recursion{
  public static double sqrt(double n, double tolerance){
    return recursion.sqrtHelper(n, 1.0, tolerance);
  }
  private static double sqrtHelper(double n, double guess, double tolerance){
    // this stores the new guess using Newton's Square Root Approximation Equation
    double newGuess = (n / guess + guess) / 2.0;
    // this stores how accurate the answer was by using percent error
    double accurate = (Math.abs(n - (guess * guess))) / n;
    // if the stored accurate value is greater than the tolerance then it will do the
    // recursive case
    if (accurate > tolerance){
    // only thing changing is that we replace guess with newGuess
      return sqrtHelper(n, newGuess, tolerance);
    }else{
    // otherwise it means that it passes the tolerance and it will return the new new
    // guess (BASE CASE)
      return newGuess;
    }
  }

  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> ans = new ArrayList<Integer>();
  }
}
