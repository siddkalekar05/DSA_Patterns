import java.util.*;

class SearchingDemo1 {
    static int search(int arr[] , int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ele for search : ");
        int ele = sc.nextInt();
        int arr[] = new int[]{7,12,34,56,9,8,4,2};
        int index = search(arr,ele);
        if(index==-1){
            System.out.println("Ele not found");
        }else{
            System.out.println("Ele found at index : "+index);
        }
    }
    
}
