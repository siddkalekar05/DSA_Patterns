class ArrayDemo1{
    static int max(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int arr[] = new int[]{12,15,8,9,4,98};
        int max1 = max(arr);
        System.out.println("Max ele : "+max1);
    }
}