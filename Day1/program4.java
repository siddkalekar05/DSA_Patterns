/*
4️⃣ Reverse an Array
Pattern:

Two-pointer traversal

Brute:

Create new array (O(n) space)

Optimized:

Swap start & end
Time: O(n)
*/
class ArrayDemo4{
    static void sort2(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
    
    public static void main(String[] args){
        int arr[] = new int[]{12,15,8,9,4,98};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sort2(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

