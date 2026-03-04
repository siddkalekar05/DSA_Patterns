class Parent {
    int sum(int a , int b ){
        return a+b;
    }   
}
class Child extends Parent {
    int sum(int a,int b,int c){
        return a+b+c; 
    }    
}
class Demo1 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.sum(10,12, 14));
        System.out.println(c.sum(12,13));
    } 
}

