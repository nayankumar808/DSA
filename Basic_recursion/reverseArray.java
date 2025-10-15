package Basic_recursion;

public class reverseArray {
  public static void reverse(int arr[], int start, int end) {
    if (start >= end) {
      return;
    }
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    reverse(arr, start + 1, end - 1);

  }

  public static void main(String[] arg) {
    int arr[] = { 0, 1, 2, 3, 4, 5 };
    reverse(arr, 0, arr.length - 1);
    for (int i = 0; i < arr.length - 1; i++) {
      System.out.println(arr[i]);
    }

  }

}
