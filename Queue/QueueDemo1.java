class EnqueueDemo {

    int arr[] = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int x){

        rear++;              
        arr[rear] = x;   
    }

    public static void main(String[] args){

        EnqueueDemo q = new EnqueueDemo();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println("Rear element: " + q.arr[q.rear]);
    }
}