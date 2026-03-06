import java.util.*;
class TwoPointerDemo7{
    static String reveString(char arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end] =  temp;
            start++;
            end--;
        }
        
        return new String(arr);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        String str2 = reveString(arr);
        System.out.println("Reverse string : "+str2);
    }
}