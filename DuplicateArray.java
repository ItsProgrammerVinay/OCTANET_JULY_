import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * DuplicateArray
 */
public class DuplicateArray {

  public static void main(String[] args) {

    int arr[] = { 2, 5, 6, 98, 4, 6 };
    int a[] = { 1, 1, 2, 2, 3, 3, 3 };
    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
    System.out.println("_______________________________________________________");
    // System.out.println("Largest Element in the array is:" + largestElement(arr));
    // System.out.println(isSorted(arr));
    // int ans[] = removeDulpicates(a);
    // System.out.println("There are <|" + removeDulpicates(a) + " |>Duplicates element arr there in the array");
    // printArray(ans);
    // int ans[] = new int[removeDulpicates(arr)];
    // ans[]=Arrays.copyOf(a[0], removeDulpicates(arr));
    // printArray(ans);
    // System.out.println("_______________________________________________________");
    // System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
    // int length = removeDulpicates(arr);
    // printArray(a, length);
    int length = optimizedArray(a);

        System.out.println("Array after removing duplicates:");
        printArray(a, length);

  }

  static void printArray(int arr[],int length) {
    for (int i = 0; i < length; i++) {
      System.out.print(arr[i]+" ");
    }
  }

  static int optimizedArray(int arr[]) {
    int i = 0;

    for (int j = 1; j < arr.length; j++) {
      if (arr[i] != arr[j]) {
        i++;
        arr[i] = arr[j];
      }
    }

    return (i + 1);
  }
  
  static int removeDulpicates(int arr[]) {
    int i = 0;
    for (int j = 1; j < arr.length; j++) {
      if (arr[i] != arr[j]) {
        i++;
        arr[i] = arr[j];
        
      }
    }
    return (i+1);
  }

  static boolean isSorted(int arr[]){
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      if (arr[i] >= arr[i - 1]) {
       
      } else {
        return false;
      }
    }
    return false;
  }

  static int largestElement(int arr[]) {
    int n = arr.length;
    int largest = arr[0];
    for (int i = 0; i < n; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }
    return largest;
  }

}