public class stockPractice {

  public static void main(String[] args) {
    int[] pairs = new int[]{10 ,20, 20, 10 ,10, 30, 50, 10, 20
};
    sockMerchant(2, pairs);
  }


    public static int sockMerchant(int n, int[] ar) {
        int numberOfPairs = 0;
        int numOfPairs;
        int numSeen = false;
        boolean seenNum;
        for (int i = 0; i < ar.length; i++) {
            numOfPairs = 0;
            numSeen = 1;

            for (int j = i +1 ; j < ar.length; j++) {
              if (seenNum == true) {
                break;
              } else if (ar[i] == ar[j] && (numSeen % 2) != 0) {
                      numOfPairs++;
                      seenNum = true;
                      numberOfPairs += numOfPairs;

                  } else if (ar[i]== ar[j]) {
                      seenNum = true;
                      numberOfPairs += numOfPairs;

                  }
                }


            }
            System.out.println(numberOfPairs);
            return numberOfPairs;
    }
  }
