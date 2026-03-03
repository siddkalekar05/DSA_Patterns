class ArrayDemo7 {
    static void product(int arr[]){
        int product = 1;
        for(int num:arr){
            product*=num;
        }
        System.out.println("Product of entire array : "+product);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        product(arr);
    }
    
}
