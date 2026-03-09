import java.util.*;

class FirstUnique {

    static void unique(String str){

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : str.toCharArray())
            map.put(c, map.getOrDefault(c,0)+1);

        for(char c : str.toCharArray()){

            if(map.get(c)==1){

                System.out.println("First Unique: "+c);
                return;
            }
        }
    }

    public static void main(String[] args){

        unique("swiss");
    }
}