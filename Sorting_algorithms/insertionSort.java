package Sorting_algorithms;

public class insertionSort {
  public static void SelectionSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      int j = i;
      while (j > 0 && arr[j - 1] > arr[j]) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 5, 6, 2, 3, 4, 1, 0, 5, 6, 7 };
    System.out.println("Array before sorting");
    for (int i : arr) {
      System.out.println(i);

    }
    SelectionSort(arr);
    System.out.println("Array after sorting");
    for (int i : arr) {
      System.out.println(i);

    }

  }
}
