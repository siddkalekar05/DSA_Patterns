class QueueAllOps {

    int arr[] = new int[5];
    int front = 0;
    int rear = -1;

    void enqueue(int x){
        arr[++rear] = x;
    }

    void dequeue(){
        System.out.println("Removed: " + arr[front++]);
    }

    void peek(){
        System.out.println("Front: " + arr[front]);
    }

    public static void main(String[] args){

        QueueAllOps q = new QueueAllOps();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.peek();     
        q.dequeue();  
        q.peek();     
    }
}