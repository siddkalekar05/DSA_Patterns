class QueueDisplay {

    int arr[] = {10,20,30,40};
    int front = 0;
    int rear = 3;

    void display(){

        for(int i = front; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){

        QueueDisplay q = new QueueDisplay();

        q.display();
    }
}