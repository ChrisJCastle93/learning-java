public class Positive{

  public static int sum(int[] arr){
    // get array length
    int arrSize = arr.length;

    // If array is empty, return 0
    if(arrSize == 0) return 0;

    // Init sum to 0
    int sum = 0;

    // Loop through array
    for (int value : arr) {
        // If value is positive, add to sum
        if (value > 0) {
            sum += value;
        }
    }

    // Return sum
    return sum;
  }
}