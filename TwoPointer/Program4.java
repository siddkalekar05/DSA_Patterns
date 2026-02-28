/*
Problem Statement:

Move all zeroes to the end of the array while maintaining
relative order of non-zero elements.

Pattern Used:

Two Pointer (Slow-Fast Pointer)

Approach:

Use slow pointer to track position for next non-zero.
Use fast pointer to traverse entire array.
When non-zero found, swap with slow pointer.

Time Complexity:

O(n)
*/

class TwoPointerDemo4{
    static void  move(int arr[]){
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
               int temp = arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args){
        int arr[] = new int[]{0,1,0,3,12};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        move(arr);
    }

}
