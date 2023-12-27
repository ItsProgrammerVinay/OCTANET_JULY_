import java.util.Scanner;

public class Array2D {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number of Rows");
        int r = sc.nextInt();
        System.out.println("Enter number of columns");
        int c = sc.nextInt();

        int[][] arr = new int[r][c]; // total = r*c

        System.out.println("Enter " + r*c + " elements");
    for (int i = 0; i < r; i++) {
    
      for (int j = 0; j < c; j++) {
        
        arr[i][j]=sc.nextInt();
      }
      System.out.println("");
    }
print2dArray(arr);
  }

  public static void print2dArray(int[][] arr) {
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println("");
    }
  }

  public static void add(int arr [][],int r1,int c1,,int arr2[][],int r2,int c2){
    if(r1!=c1 || r2!=c2){
      System.out.println("Invalid Input!!!");
      return;
    }
    for(int i=0;)
  }
  
}
