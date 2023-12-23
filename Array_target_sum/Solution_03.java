public class Solution_03 {
  public static void main(String[] args) {
    int arr[] = { 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0 };
    sortZerosAnsOnce(arr);
    printArrays(arr);
  }
  public static void printArrays(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
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
