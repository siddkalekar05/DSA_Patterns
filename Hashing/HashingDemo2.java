import java.util.*;

class FindDuplicates {

    static void duplicates(int arr[]){

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){

            if(set.contains(num))
                System.out.print(num + " ");

            else
                set.add(num);
        }
    }

    public static void main(String[] args){

        int arr[] = {1,2,3,2,4,3};

        duplicates(arr);
    }
}