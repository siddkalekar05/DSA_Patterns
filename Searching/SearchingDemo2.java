import java.util.*;
class SearchingDemo2 {
    static int binary(int arr[] , int start, int end,int target){

        while(start<end){
            int mid = (start+end)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid]){
                start=mid;
            }else{
                end = mid-1;
            }
        }
        return -1;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{10,20,30,40,50};
        int start = 0;
        int end = arr.length;
        System.out.println("Enter target value : ");
        int target = sc.nextInt();
        int index =  binary(arr,start,end,target);
        if(index==-1){
            System.out.println("Ele is not found");
        }else{
            System.out.println("Ele found at index : "+index);
        }
    }
    
}
