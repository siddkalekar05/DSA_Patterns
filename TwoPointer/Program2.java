class TwoPointerDemo2{
    static void  sort(int arr[]){
        int start = 0;
        int end = arr.length-1;
        boolean flag = true;
        while(start<end){
            if(arr[start]!=arr[end]){
                flag = false;
                return;
            }
            start++;
            end--;
        }
        System.out.println(flag);    
    }
    public static void main(String[] args){
        int arr[] = new int[]{12,13,14,15,14,13,12};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sort(arr);
    }
}