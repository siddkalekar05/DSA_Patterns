import java.util.*;
class HashingDemo1 {
    static void hashing(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : arr){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        System.out.println(hm);
    }
    public static void main(String[] args) {
       int arr[] = new int[]{1,2,3,1,2,1,4,3,4};
       hashing(arr);
    }
    
}
