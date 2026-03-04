import java.util.*;
class Demo1 {
    static void reverse(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String reverse = new String(sb);
        System.out.println(reverse);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        reverse(s);
    } 
}

