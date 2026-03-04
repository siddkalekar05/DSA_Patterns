import java.util.*;
class Demo1 {
    static void max(int arr[]){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max ele : "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of an arr : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array ele : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        max(arr);
    } 
}

