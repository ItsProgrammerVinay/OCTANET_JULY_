public class ArrayProblems {
  public static void main(String[] args) {
    int arr[] = { 1, 2, 4, 5 };
    int n=5;
    System.out.println(missingNumber(arr,n));

  }

  static int missingNumber(int arr[],int num) {
    
    int sum = num*(num+1)/2;
    int s2=0;
    
    for(int i=0;i<arr.length;i++){
      s2 += arr[i];
    }
    return sum-s2;
  }
}
