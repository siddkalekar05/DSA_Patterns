import java.util.*;
class SlidingWindow2{
    static void window(int arr[],int k){
        int windowsum = 0;
        for(int i=0;i<k;i++){
            windowsum+=arr[i];
        }
        int minSum = windowsum;
    
        for(int i=k;i<arr.length;i++){
            windowsum+=arr[i];
            windowsum-=arr[i-k];
            minSum = Math.min(minSum, windowsum);
        }
        System.out.println("Min sum os sub array : "+minSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{2,1,5,1,3,2};
        System.out.println("Enter size of window : ");
        int k = sc.nextInt();
        window(arr,k);
    }
}