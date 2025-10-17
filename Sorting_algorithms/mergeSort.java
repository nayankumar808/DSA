package Sorting_algorithms;

import java.util.ArrayList;

public class mergeSort {
  public static void merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid + 1;
    while (left <= mid && right <= high) {
      if (arr[left] < arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }
    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }
    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
  }

  public static void mergesort(int[] arr, int low, int high) {
    if (low >= high) {
      return;
    }
    int mid = (low + high) / 2;
    mergesort(arr, low, mid);
    mergesort(arr, mid + 1, high);
    merge(arr, low, mid, high);
  }

  public static void main(String[] args) {
    int[] arr = { 9, 6, 88, 33, 66, 4, 25, 65, 14 };

    System.out.println("Array before sorting");

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    mergesort(arr, 0, 8);
    System.out.println("Array after sorting");

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

  }

}
