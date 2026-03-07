class FirstNegative {

    static void firstNeg(int arr[], int k){
        for(int i=0;i<=arr.length-k;i++){
            boolean found=false;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    System.out.print(arr[j]+" ");
                    found=true;
                    break;
                }
            }
            if(!found)
                System.out.print(" 0 ");
        }
    }
    public static void main(String[] args){
        int arr[] = {12,-1,-7,8,-15,30,16,28};
        firstNeg(arr,3);
    }
}