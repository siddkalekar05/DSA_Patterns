import java.util.*;
class StackDemo5 {
    String reverse(String str){
        Stack st = new Stack<>();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        char stackarr[] = new char[str.length()];
        int i = 0;
        while(!st.empty()){
            stackarr[i] = (char) st.pop();
            i++;
        }
        return new String(stackarr);
    }
}
class Client{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        StackDemo5 st = new StackDemo5();
        String rev = st.reverse(str);
        System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not pallindrome");
        }
    }
}
