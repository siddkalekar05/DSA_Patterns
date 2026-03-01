class PrefixDemo6 {
    static void pivot(int arr[]){
        int totalsum = 0;
        for(int i=0;i<arr.length;i++){
           totalsum+=arr[i];
        }
        int leftsum = 0;
        for(int i=0;i<arr.length;i++){
            if(leftsum == totalsum-leftsum-arr[i]){
                System.out.println("Pivot ele : "+i);
                return;
            }
            leftsum+=arr[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,7,3,6,5,6};
        pivot(arr);
    }
    
}
