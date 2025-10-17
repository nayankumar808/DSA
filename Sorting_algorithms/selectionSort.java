package Sorting_algorithms;

public class selectionSort {
  private static void SelectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int min_index = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[min_index]) {
          min_index = j;
        }
        int temp = arr[min_index];
        arr[min_index] = arr[i];
        arr[i] = temp;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 8, 6, 4, 3, 9, 7, 1, 0 };
    System.out.println("Array before sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);

    }
    SelectionSort(arr);
    System.out.println("Array after sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);

    }
  }

}
