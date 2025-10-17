package Sorting_algorithms;

public class bubbbleSort {
  public static void sorting(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }

      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 9, 3, 5, 2, 0, 6, 7, 0 };
    System.out.println("Array before sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    sorting(arr);
    System.out.println("Array after sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

}
