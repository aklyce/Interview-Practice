import java.util.*;

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

    //int index = 0;
    //int sum = 0;
    //while (index < args.length) {
    //  	sum = sum + Integer.parseInt(args[index]);
    //  	index = index + 1;
    List<Integer> prices = new ArrayList<Integer>();
    prices.add(2);
    prices.add(3);
    prices.add(1);
    prices.add(2);
    prices.add(4);
    prices.add(2);

    finalPrice(prices);
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

      static int differentTeams(String skills) {
    int physics = 0;
      int chemistry = 0;
      int math = 0;
      int botany = 0;
      int zoology = 0;
      int counter = 0;
      char[] skillsChar = skills.toCharArray();
      for (char p : skillsChar) {
          char pee = 'p';
          char see = 'c';
          char zee = 'z';
          char bee = 'b';
          char em = 'm';
          System.out.println(p == pee);
          if (p == pee){
              physics += 1;
          } else if (p == see) {
              chemistry += 1;
          } else if (p == em) {
              math += 1;
          } else if (p == bee) {
              botany += 1;
          } else if (p == zee) {
              zoology += 1;
          }
      }
      while (physics != 0 && chemistry != 0 && math != 0 && botany != 0 && zoology != 0){
          physics -=1;
          chemistry -=1;
          math -=1;
          botany -=1;
          zoology -=1;
          counter++;
      }
        return counter;

    }


    public static void finalPrice(List<Integer> prices) {
        List<Integer> fullPriced = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i< prices.size(); i++) {
          if (i == prices.size() - 1){
            sum += prices.get(i);
            fullPriced.add(i);
            break;
          }
            for (int j = i + 1; j < prices.size(); j++){
                if (prices.get(i) >= prices.get(j)){
                    sum += (prices.get(i) - prices.get(j));
                    break;
                }
                if (prices.get(i) != prices.size() -1 && j == prices.size()-1) {
                  sum+= prices.get(i);
                  fullPriced.add(i);
                }
            }
        }
        System.out.println(sum);
    }
}
