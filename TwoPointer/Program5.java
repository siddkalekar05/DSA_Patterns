/*
Problem Statement:
------------------
Given a sorted array, remove duplicates in-place and return
the length of unique elements.

Pattern Used:

Two Pointer (Slow-Fast Pointer on Sorted Array)

Approach:

Slow pointer tracks last unique element.
Fast pointer scans for new distinct elements.
When found, update slow position.

Time Complexity:

O(n)
*/


class TwoPointerDemo5{
    static void  unique(int arr[]){
        int j = 0;
        for(int i=1;i<arr.length;i++){
           if(arr[i]!=arr[j]){
                j++;    
                arr[j]=arr[i];
           }
        }
        j=j+1;
        for(int i=0;i<j;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args){
        int arr[] = new int[]{1,1,2,2,3};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        unique(arr);
    }

}
