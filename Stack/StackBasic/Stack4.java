class StackEmpty {

    int top = -1;

    void check(){

        if(top == -1)
            System.out.println("Stack is empty");
        else
            System.out.println("Stack is not empty");
    }

    public static void main(String[] args){

        StackEmpty s = new StackEmpty();

        s.check();
    }
}