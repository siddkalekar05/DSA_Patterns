import java.util.*;
class SlidingWindow4 {
    static void count(int arr[],int k){
        int subArrayCount = arr.length-k+1;
        System.out.println(subArrayCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{1,2,3,4,5};
        System.out.println("Enter size of k : ");
        int k = sc.nextInt();
        count(arr,k);
    }  
}
