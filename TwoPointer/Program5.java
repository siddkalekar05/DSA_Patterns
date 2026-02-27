class TwoPointerDemo5{
    static void  unique(int arr[]){
        int j = 0;
        for(int i=1;i<arr.length;i++){
           if(arr[i]!=arr[j]){
                j++;    
                arr[j]=arr[i];
           }
        }
        j=j+1;
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args){
        int arr[] = new int[]{1,1,2,2,3};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        unique(arr);
    }
}