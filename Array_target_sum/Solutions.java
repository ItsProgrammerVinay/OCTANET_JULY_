import java.util.Scanner;
class Solutions {
  public static void main(String[] args) {
    int arr[] = { 2,5,6,1,6};
    // sortZeros(arr);
    // printArrays(arr);
    // System.out.println();
    // sortZerosAnsOnce(arr);
    // printArrays(arr);
    // System.out.println("--------------------------------------------");
    // System.out.println("RESULT:"+subArraySum(arr));
    // System.out.println("--------------------------------------------");
    // printArrays(arr);
    sumOfRange(arr);
  
  }

  public static int[] makePrefixArray(int arr[]) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      arr[i] = arr[i - 1] + arr[i];//arr[i]+=arr[i-1];
    }
    return arr;
  }

  public static void sumOfRange(int arr[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Query Range");
    int q = sc.nextInt();
    int prefixSum[] = makePrefixArray(arr);
    while (q-- > 0) {
      System.out.print("Enter the Value of L:");
      int l = sc.nextInt();
      System.out.println("");
      System.out.print("Enter thr Value of R:");
      int r = sc.nextInt();
      if (l > arr.length) {
        System.out.println("Enter the valid Range");
        l = sc.nextInt();
      }
      if(r>arr.length){
        System.out.println("Enter the valid range");
        r = sc.nextInt();
      }
      

      int ans = prefixSum[r] - prefixSum[l - 1];
      System.out.println("Sum is =" + ans);
    }
  }
  
  public static int totalSum(int arr[]) {
  int n=arr.length;
  int total = 0;
  for (int i = 0; i < n; i++) {
    total += arr[i];
  }
  return total;
  
}
  public static boolean subArraySum(int arr[]) {
    int n = arr.length;
    int prefixSum = 0;
  int total = totalSum(arr);
  for (int i = 0; i < n; i++) {
    prefixSum += arr[i];
    int suffixSum = total - prefixSum;
    if (suffixSum == prefixSum) {
      return true;
    }
  }
  return false;

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

  public static void sortZeros(int arr[]) {
    int n = arr.length;
    int left = 0;
    int right = n - 1;
    while (left < right) {
      if (arr[left] == 1 && arr[right] == 0) {
        swap(arr, left, right);
        left++;
        right--;

      }
      if (arr[left] == 0) {
        left++;

      }
      if (arr[right] == 1) {
        right--;
      }
    }
  }
}