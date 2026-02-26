class ArrayDemo3{
    static boolean sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int arr[] = new int[]{12,15,8,9,4,98};
        boolean sort1 = sort(arr);
        System.out.println("Array is sorted : "+sort1);
    }
}