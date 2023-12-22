class ClassRoom{
    public static void main(String[] args) {
        int arr[]={10,2,3,4,5,2};
        int target=11;

        // System.out.println("ans is ="+tripletSum(arr, target));
        // System.out.println("Pair Sum is = "+pairSum(arr, target));
        // int ans[]=smallesrAndLargetSum(arr);
        // System.out.println("Smallest is:"+ans[0]);
        // System.out.println("Largest is :"+ans[1]);
        // System.out.println(isSortes(arr));
        System.out.println(occurenceOfElement(arr,target));
        System.out.println(lastOccurenceOfElement(arr, target));
        System.out.println(stricklyGreater(arr, target));
        
    }

    public static int occurenceOfElement(int arr[],int x){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

    public static int lastOccurenceOfElement(int arr[],int x){
        int count=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count=i;
            }
        }
        return count;
    }

    public static boolean stricklyGreater(int arr[],int x){
    boolean isgreater=true;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>x){
               isgreater=false;

            }
           
        }
        return isgreater;
    } 

    public static boolean isSortes(int arr[]){
        boolean check=true;
        int n=arr.length;

        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
    }

    public static int[] smallesrAndLargetSum(int arr[]){

        int ans[]={arr[0],arr[arr.length-1]};
        return ans;

    }


    public static int pairSum(int arr[],int x){
        int count=0;
        int  n=arr.length-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }


    public static int tripletSum(int arr[],int target){
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                    ans++;

                    }
                }
            }
        }
        return ans;
    }
}