import java.util.*;

class InterleaveQueue {

    public static void main(String[] args){

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        int size = q.size()/2;

        Queue<Integer> firstHalf = new LinkedList<>();

        for(int i=0;i<size;i++){
            firstHalf.add(q.remove());
        }

        while(!firstHalf.isEmpty()){

            q.add(firstHalf.remove());
            q.add(q.remove());
        }

        System.out.println(q);
    }
}