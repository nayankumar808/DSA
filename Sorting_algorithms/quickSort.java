package Sorting_algorithms;

public class quickSort {
  public static int partion(int[] arr, int s, int e) {
    int pivot = arr[s];
    int count = 0;
    for (int i = s + 1; i <= e; i++) {
      if (arr[i] <= pivot) {
        count++;
      }
    }
    int pivot_index = s + count;

    int temp = arr[s];
    arr[s] = arr[pivot_index];
    arr[pivot_index] = temp;
    int sindx = s;
    int eindx = e;

    while (sindx < pivot_index && eindx > pivot_index) {
      while (arr[sindx] <= pivot) {
        sindx++;
      }
      while (arr[eindx] > pivot) {
        eindx--;
      }
      if (sindx < pivot_index && eindx > pivot_index) {
        temp = arr[sindx];
        arr[sindx] = arr[eindx];
        arr[eindx] = temp;
        sindx++;
        eindx--;
      }

    }
    return pivot_index;
  }

  public static void quicksort(int[] arr, int s, int e) {
    if (s >= e) {
      return;
    }
    int p = partion(arr, s, e);

    quicksort(arr, s, p - 1);
    quicksort(arr, p + 1, e);

  }

  public static void main(String[] args) {
    int[] arr = { 2, 5, 6, 3, 1, 2, 9, 8, 22, 1, 3, 13, 15, 11 };

    System.out.println("Array before sorting");
    for (int i : arr) {
      System.out.println(i);
    }

    quicksort(arr, 0, arr.length - 1);
    System.out.println("Array After sorting");
    for (int i : arr) {
      System.out.println(i);
    }
  }

}
