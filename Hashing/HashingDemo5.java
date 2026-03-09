import java.util.*;

class MissingNumber {

    static void find(int arr[], int n){

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr)
            set.add(num);

        for(int i=1;i<=n;i++){

            if(!set.contains(i)){

                System.out.println("Missing: "+i);
                return;
            }
        }
    }

    public static void main(String[] args){

        int arr[]={1,2,4,5};

        find(arr,5);
    }
}