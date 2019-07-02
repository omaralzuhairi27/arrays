package com.company;

import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Enter a count!");
    int number = scanner.nextInt();
    int[] receivedArray = getArray(number);
    int minNumber = getMinNumber(receivedArray);
    System.out.println("The Min Number is "+minNumber);
    // write your code here
  }

  private static int[] getArray(int number) {
    int[] array = new int[number];
    for (int i = 0; i < array.length; i++) {
      System.out.println("Enter a number!");
      array[i] = scanner.nextInt();
      scanner.nextLine();
    }
    return array;
  }

  private static int getMinNumber(int[] array) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
      int value = array[i];
      if (value < min) {
        min = value;
      }
    }
    return min;
  }
}
