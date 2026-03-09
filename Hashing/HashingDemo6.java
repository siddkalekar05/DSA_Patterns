import java.util.*;

class OddOccurrence {

    static void find(int arr[]){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr)
            map.put(num,map.getOrDefault(num,0)+1);

        for(int key : map.keySet()){

            if(map.get(key)%2!=0)
                System.out.println(key);
        }
    }

    public static void main(String[] args){

        int arr[]={1,2,3,2,3,1,3};

        find(arr);
    }
} 
