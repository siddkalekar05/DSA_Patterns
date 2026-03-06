import java.util.*;
class PalindromeNumber {

    static void check1(int num){

        int original = num;
        int reverse = 0;

        while(num != 0){

            int digit = num % 10;

            reverse = reverse * 10 + digit;

            num = num / 10;
        }

        if(original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = sc.nextInt();
        check1(num);
    }
}