import java.util.*;
class HashingDemo2 {
    static boolean duplicate(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for(int num : arr){
            if(hs.contains(num)){
                return true;
            }
            hs.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
      int arr[] = new int[]{1,1,2,2,3,3,4,4,5};
      System.out.println(duplicate(arr));
    }
    
}
