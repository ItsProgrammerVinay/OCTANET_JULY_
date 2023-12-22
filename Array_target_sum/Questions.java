class Questions{
    public static void main(String[] args) {
        
        int arr[]={2,4,3,5,6,44};

        System.out.println("Max Element in arr is:"+maxElement(arr));
        System.out.println("Second Element in arr is:"+secMaxElement(arr));
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