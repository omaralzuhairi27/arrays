import java.util.Scanner;

public class Main {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    int[] myIntegers = getInteger(5);
    int[] sortedArray= sortArray(myIntegers);
    printArray(sortedArray);

  }

  private static int[] sortArray(int[] array) {
    int[] copyedArray=new int[array.length];
    for (int i = 0; i < array.length; i++) {
      copyedArray[i]=array[i];

    }
    boolean flag=true;
    int temp;
    while (flag){
      flag=false;
      for (int i = 0; i < copyedArray.length - 1; i++) {
        if(copyedArray[i]<copyedArray[i+1]){
          temp=copyedArray[i];
          copyedArray[i]=copyedArray[i+1];
          copyedArray[i+1]=temp;
          flag=true;
        }
      }
    }
    return copyedArray;
  }

  private static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Element " + i + " contents " + array[i]);
    }
  }

  private static int[] getInteger(int capacity) {
    int[] array = new int[capacity];
    System.out.println("Enter "+ capacity + " Integer Value:\r");
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }
    return array;
  }

}
