public class Solution_03 {
  public static void main(String[] args) {
    int arr[] = { 1,2,3,4,5,6 };
    // sortZerosAnsOnce(arr);
    int ans[] = sortSquares(arr);

    printArrays(ans);
  }

  public static void printArrays(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static int[] sortSquares(int arr[]) {
    int n = arr.length;
    int ans[] = new int[n];
    int k=n-1;
    int left = 0;
    int right=n-1;
    while (left <= right) {
      if (Math.abs(arr[left]) > Math.abs(arr[right])) {
        ans[k--] = arr[left] * arr[left];
        left++;

      } else {
        ans[k--] = arr[right] * arr[right];
        right--;
      }

    }
    return ans;
  }
  public static void sortZerosAnsOnce(int arr[]){
    int n=arr.length;
    int zeroes = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 0) {
        zeroes++;
      }
    }
    for(int i=0;i<n;i++){
      if(i<zeroes){
        arr[i] = 0;
      } else {
        arr[i] = 1;
      }
    }
  }
}
