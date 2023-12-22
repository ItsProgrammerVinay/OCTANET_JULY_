class Questions{
    public static void main(String[] args) {
        
        int arr[]={1,4,2,3,4,5,2};

        // System.out.println("Max Element in arr is:"+maxElement(arr));
        // System.out.println("Second Element in arr is:"+secMaxElement(arr));
        // System.out.println("MIN Element in arr is:"+minElement(arr));
        // System.out.println("Sec Min Element in arr is:"+secMinElement(arr));
        System.out.println("first Reapeating Number is :"+firstReapeatingNumber(arr));
    }

    public static int firstReapeatingNumber(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;i++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static int minElement(int arr[]){
        int min_value=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min_value){
                min_value=arr[i];
            }
        }
        return min_value;
    }

    public static int secMinElement(int arr[]){
        int min=minElement(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int sec_min=minElement(arr);
        return sec_min;
    }

    public static int maxElement(int arr[]){
        int max_value=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i]>max_value){
                max_value=arr[i];

            }
        }
        return max_value;

    }

    public static int secMaxElement(int arr[]){
        int max=maxElement(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }
             
        }
        int secondMax_value=maxElement(arr);
       return secondMax_value;
    }
}