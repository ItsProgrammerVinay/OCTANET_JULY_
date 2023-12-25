import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ClassRoom{
    public static void main(String[] args) {
        int arr[] = { 10, 2, 3, 4, 5, 2 };
        int target = 11;

        // System.out.println("ans is ="+tripletSum(arr, target));
        // System.out.println("Pair Sum is = "+pairSum(arr, target));
        // int ans[]=smallesrAndLargetSum(arr);
        // System.out.println("Smallest is:"+ans[0]);
        // System.out.println("Largest is :"+ans[1]);
        // System.out.println(isSortes(arr));
        // System.out.println(occurenceOfElement(arr,target));
        // System.out.println(lastOccurenceOfElement(arr, target));
        // System.out.println(stricklyGreater(arr, target));
        // arrayList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number :");
        int num = sc.nextInt();
        printIncreasing(num);

    }

    
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }

    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    public static void printDecreasing(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        printIncreasing(n - 1);

    }
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    public static void arrayList() {
        List<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(6);
        li.add(9);
        System.out.println(li.getFirst());
        li.remove(Integer.valueOf(6));
        System.out.println(li.remove(0));
    }

    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||


    public static int occurenceOfElement(int arr[], int x) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }
    
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    public static int lastOccurenceOfElement(int arr[], int x) {
        int count = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count = i;
            }
        }
        return count;
    }
    
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    public static boolean stricklyGreater(int arr[], int x) {
        boolean isgreater = true;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                isgreater = false;

            }

        }
        return isgreater;
    }
    
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    public static boolean isSortes(int arr[]) {
        boolean check = true;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        return check;
    }
    
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    public static int[] smallesrAndLargetSum(int arr[]) {

        int ans[] = { arr[0], arr[arr.length - 1] };
        return ans;

    }
    
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    public static int pairSum(int arr[], int x) {
        int count = 0;
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;
    }
    
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    public static int tripletSum(int arr[], int target) {
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;

                    }
                }
            }
        }
        return ans;
    }
    
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
}