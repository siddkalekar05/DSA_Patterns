class DequeueDemo {

    int arr[] = {10,20,30};
    int front = 0;
    int rear = 2;

    void dequeue(){

        System.out.println("Removed: " + arr[front]);
        front++; 
    }

    public static void main(String[] args){

        DequeueDemo q = new DequeueDemo();

        q.dequeue();
    }
}