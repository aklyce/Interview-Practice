public class DogHashTable {
  public static void main(String[] args) {

  }

  private LinkedList[] data;
  private int size;
  private int totalDogs;


  public HashTable() {
    this.size = 100;
    this.data = new Dog[size];
  }

  public HashTable(int size) {
    this.size = size;
    this.data = new Dog[size];
  }

  public void put(String key, Dog() value) {
    int hashCode = getHashCode(key);
    int index = convertToIndex(hashCode);
    LinkedList list = data[index];
    list.insert(key, value);
  }


  public void insert(){

  }

  public int getHashCode(String key) {
    int totalASCII = 0;
    for (int i = 0; i < key.length; i++) {
      totalASCII += (int)key.charAt(i);
      System.out.println(totalASCII);
    }
  }
}
