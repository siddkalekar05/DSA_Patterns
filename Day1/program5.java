class ArrayDemo5{
    static void count(int arr[]){
        int even=0;
        int odd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even count : "+even);
        System.out.println("Odd count : "+odd);
       
    }
    public static void main(String[] args){
        int arr[] = new int[]{12,15,8,9,4,98};
       count(arr);
    }
}