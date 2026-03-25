class QueueEmptyCheck {

    int front = 0;
    int rear = -1;

    void check(){

        if(front > rear)
            System.out.println("Queue is empty");
        else
            System.out.println("Queue is not empty");
    }

    public static void main(String[] args){

        QueueEmptyCheck q = new QueueEmptyCheck();

        q.check();
    }
}