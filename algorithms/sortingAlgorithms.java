public class sortingAlgorithms{

  public static void main(String[] args) {
    int[] integers = new int[]{1,2,3,4,5,6,7};
    //System.out.println(findMax(integers));
    //System.out.println(linearSearch(integers, 11));
    //System.out.println(binarySearch(integers, 11));
    int[] integers2 = new int[]{2,8,5,3,7,9};

    System.out.println(bubbleSort(integers2));
    System.out.println(merge(integers, integers2));

  }

  // the time complexity for this problem:
  //the if-statment runs n- number of times
  //the for-loop runs n-1 times and them you add them to get 2n-1
  //take big term and get time complexity is theta n
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
  // the if-statement does n comparisons and the for-loop does n comparisons
  //adding them you get 2n, which is just time complexity theta n
  public static boolean linearSearch(int[] integers, int target) {
    for (int i = 0; i < integers.length; i++) {
      if (integers[i] == target) {
        return true;
      }
    }
    return false;
  }

  int[] integers = new int[]{1,2,3,4,5,6,7};



// time complexity: the while loop runs for n-1 elements so it theta of n
  public static boolean binarySearch(int[] integers, int target) {
    int low = 0;
    int high = integers.length -1;
    int middle;
    while (high - low > 1) {
      middle = high + low / 2;
      if (integers[middle] > target) {
        high = middle;
      } else {
        low = middle;
      }
    }
    return target == low;
  }


//time complexity: outter for loop you do n comparsions, inner for loop you do n-1 comparsions
//and if statment you compare n comparisons, you multiply the two for loops together because
//for every element int he first four loop the second one runs the same amount of times
//so n + n-1 = 2n-1 * n == 2n^2 -n == theta of n^2
  public static int[] bubbleSort(int[] integers) {
    for (int i =  0; i < integers.length; i++) {
      for (int j = 1; j < integers.length; j++) {
        if (integers[i] > integers[j]) {
          int temp = integers[i];
          integers[i] = integers[j];
          integers[j] = temp;
        }
      }
    }
    return integers;
  }

  // public static int[] merge(int[] list1, int[] list2) { //lists are SORTED
  //   if (list1.isEmpty()) {
  //     return list2;
  //   } else if (list2.isEmpty()) {
  //     return list1;
  //   } else if (list1[0] < list2[0]) {
  //     int[] list;
  //     return list = new int[]{list[0], merge(list1[1:], list2)};
  //   } else {
  //     return new int[]{list2[0],merge(list1, list2[1:])]};
  //   }
  //
  // }

  public static int[] mergeSort() {

  }


}
