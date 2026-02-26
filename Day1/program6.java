class ArrayDemo6{
    static void large(int arr[]){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }else if (arr[i]>second && arr[i]!=first) {
                second=arr[i];
            }
        }
        System.out.println("First large : "+first);
        System.out.println("Second large : "+second);
        
       
    }
    public static void main(String[] args){
        int arr[] = new int[]{12,15,8,9,4,98};
        large(arr);
    }
}