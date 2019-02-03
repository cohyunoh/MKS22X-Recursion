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
    // makes an ArrayList that will be populated with all the sums
    ArrayList<Integer> ans = new ArrayList<Integer>();
    // it then calls the helper method and will run until the method is done
    recursion.makeAllSumsHelper(n, 0, ans);
    // once done, it will return the ArrayList
    return ans;
  }
//VISUAL REPRESENTATION
//                             h(3,0,L)
//                          /           \
//                  h(2,3,L)              h(2,0,L)
//               /        \              /         \
//        h(1,5,L)        h(1,3,L)      h(1,2,L)       h(1,0,L)
//        /     \         /      \       /     \       /      \
//  h(0,6,L) h(0,5,L) h(0,4,L) h(0,3,L)*2  h(0,2,L) h(0,1,L) h(0,0,L)
  public static void makeAllSumsHelper(int n, int i, ArrayList<Integer> L){
    // Once n is 0 it will add whatever the i value is
    if(n == 0){
      L.add(i);
    }else{
    // otherwise it will do the recursive call which calls itself twice for both cases
      makeAllSumsHelper(n - 1, i, L);
      makeAllSumsHelper(n - 1, i + n, L);
    }
  }
}
