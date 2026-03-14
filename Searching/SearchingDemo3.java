import java.util.*;
class SearchingDemo3 {
    static void occur(int arr[] , int target){
        int first = -1;
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                if(first==-1){
                    first=i;
                }
            }
        }
        System.out.println("First occurance : "+first);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ele for search first and last occurence : ");
        int target = sc.nextInt();
        int arr[] = new int[]{1,1,2,2,2,3,4,4,4,4};
        occur(arr,target);
    }
    
}
