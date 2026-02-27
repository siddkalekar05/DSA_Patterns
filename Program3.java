class TwoPointerDemo3{
    static void  move(int arr[]){
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args){
        int arr[] = new int[]{0,1,0,3,12};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        move(arr);
    }
}