/*
2️⃣ Find Manimum Element in Array
Pattern Used:

Basic Traversal

When to Use:

When you need the largest/smallest value.

Brute Force:

Sort the array → return last element
Time: O(n log n)

Optimized:

Single traversal, keep track of max
*/
class ArrayDemo2{
    static int min(int arr[]){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int arr[] = new int[]{12,15,8,9,4,98};
        int min1 = min(arr);
        System.out.println("Min ele : "+min1);
    }

}
