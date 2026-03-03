/*
Problem Statement:
Given an array of integers, calculate and print 
the product of all elements in the array.

Approach:
Initialize a variable product = 1.
Traverse the array using a loop.
Multiply each element with the product variable.
Finally, print the total product.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ArrayDemo7 {
    static void product(int arr[]){
        int product = 1;
        for(int num:arr){
            product*=num;
        }
        System.out.println("Product of entire array : "+product);
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        product(arr);
    }
    
}

