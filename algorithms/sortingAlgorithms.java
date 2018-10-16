public class sortingAlgoithmsPractice {

  public static void main(String[] args) {
    int[] integers = new int[]{1,2,3,4,5,6,7};
    //System.out.println(findMax(integers));
    System.out.println(linearSearch(integers, 11));

  }

  // the time complexity for this problem:
  //the if-statment runs n- number of times
  //the for-loop runs n-1 times and them you add them to get 2n-1
  //take big term and get time complexity is n
  public static int findMax(int[] integers) {
    int max = integers[0];
    for (int i = 0; i < integers.length; i++) {
      if (integers[i] > max) {
        max = integers[i];
      }
    }
    return max;
  }

  // the time complexity for this problem:
  public static boolean linearSearch(int[] integers, int target) {
    for (int i = 0; i < integers.length; i++) {
      if (integers[i] == target) {
        return true;
      }
    }
    return false;
  }


}
