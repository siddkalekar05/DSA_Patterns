import java.util.*;
class SearchInsert {

    static int searchInsert(int arr[], int target){

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){

            int mid = (left + right) / 2;

            if(arr[mid] == target)
                return mid;

            else if(arr[mid] < target)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return left;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int arr[] = {1,3,5,6};
        System.out.println("Enter insert ele : ");
        int target = sc.nextInt();
        System.out.println("Insert Position: " + searchInsert(arr,target));
    }
}