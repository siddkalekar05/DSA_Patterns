import java.util.*;
class Demo2 {
    static void pallindrome(int n){
        int temp = n;
        int rev = 0,r = 0;
        while(temp>0){
            r = temp%10;
            rev = (rev*10)+r;
            temp = temp/10;
        }
        System.out.println(rev);
        if(rev==n){
            System.out.println(n+ " is pallindrome number");
        }else{
            System.out.println(n+" is not pallindrome");
        }
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number  : ");
        int n = sc.nextInt();
        pallindrome(n);
    } 
}

