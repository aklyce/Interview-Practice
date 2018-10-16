static int sockMerchant(int n, int[] ar) {
        int numberOfPairs = 0;
        for (int i = 0; i < ar.length; i++) {
            int numOfPairs = 0;
            int numSeen = 1;
            for (int j = i +1 ; j < ar.length; j++) {
                if (ar[i] == ar[j] && numSeen % 2 != 0) {
                    numOfPairs++;
                    numSeen++;
                }
                if (ar[i]== ar[j]) {
                    numSeen++;
                }

            }
            numberOfPairs += numberOfPairs;
        }
        return numberOfPairs;
    }
