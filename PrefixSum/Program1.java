class PrefixDemo1 {
    static void prefix(int arr[]){
        int pre[] = new int[arr.length];
        pre[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i] = pre[i-1]+arr[i];
        }
        for(int data : pre){
            System.out.print(data+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,4,7,9,12,17};
        prefix(arr);
    }
    
}
