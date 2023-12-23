public class Solution_2 {
  public static void main(String[] args) {
    int arr[] = { 5, 7, 5, 8, 6, 9, 3, 2, 3 };
    sortByPairity(arr);
    printArrays(arr);
  }

  public static void printArrays(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void sortByPairity(int arr[]) {
    int n = arr.length;
    int left = 0;
    int right = n - 1;

    while (left < right) {
      if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
        swap(arr, left, right);
        left++;
        right--;

      }
      if (arr[left] % 2 == 0) {
        left++;
      }
      if (arr[right] % 2 == 1) {
        right--;
      }
    }
  }
}
