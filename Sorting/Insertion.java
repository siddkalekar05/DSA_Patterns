class InsertionSort {
    static void InserionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>key){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=key; 
        }
        
    }
    public static void main(String[] args) {
        int arr[] = new int[]{9,3,6,7,1,8,5,2,4};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        InserionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        } 
}
