class PrefixDemo3 {
    static void prefix(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i]+arr[i-1];
        }
        for(int data : arr){
            System.out.print(data+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,4,7,9,12,17};
        prefix(arr);
    }
    
}
