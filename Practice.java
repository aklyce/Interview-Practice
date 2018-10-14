
public class Practice {
  public static void main(String[] args){
    //int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
    //String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse", "horse shit"};
    //System.out.println(max(numbers));
    //drawTriangle(10);
    //skip(a);
    //int[] a = new int[]{1, 2, -3, 4, 5, 4};
    //windowPosSum(a, 3);
    //System.out.println(args);
    //String b = "33";
    //System.out.println(Integer.parseInt(b));

    int index = 0;
    int sum = 0;
    while (index < args.length) {
      	sum = sum + Integer.parseInt(args[index]);
      	index = index + 1;
  	}
    	System.out.println(sum);
	}


  public static void drawTriangle(int N) {
    for (int i = 1; i <= N; i++){
      for (int j = 1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static int max(int[] m) {
    int max = m[0];
    for (int i = 1; i < m.length; i++) {
      if (max < m[i]) {
        max = m[i];
      }
    }
    return max;
  }


  public static void skip(String[] list) {
    for (int i = 0; i < list.length; i += 1) {
      if (list[i].contains("horse")) {
          continue;
      }
      for (int j = 0; j < 3; j += 1) {
          System.out.println(list[i]);
      }
    }
  }

  public static void windowPosSum(int[] a, int n){
    for (int i = 0; i < a.length; i++) {
      if (a[i] < 0) {
        continue;
      }
      int counter = i;
      for (int j = 0; j < n; j++) {
        if ((counter + 1) > a.length) {
          break;
        } else{
          a[i] = a[i] + a[counter + 1];
          counter++;
        }
        }
      }
    for (int s : a){
      System.out.println(s);
    }
  }
}
