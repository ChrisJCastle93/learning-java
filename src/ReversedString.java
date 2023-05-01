public class Kata {

  public static String solution(String input) {
    StringBuilder reversed = new StringBuilder(input.length());
    for (int i = input.length() - 1; i >= 0; i--) {
        reversed.append(input.charAt(i));
    }
    return reversed.toString();
  }
}