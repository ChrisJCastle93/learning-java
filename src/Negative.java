public class Kata {

  public static int makeNegative(final int x) {
    
    // if int is less than 1, return it;
    if(x < 1) return x; 
    
    // if int is +, make it negative
    return x * -1;

  }
  
}