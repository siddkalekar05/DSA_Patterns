class KadaneIndices {

    static void maxSubarray(int arr[]){

        int maxSum = arr[0];
        int currentSum = 0;

        int start = 0;
        int end = 0;
        int tempStart = 0;

        for(int i=0;i<arr.length;i++){

            currentSum += arr[i];

            if(currentSum > maxSum){

                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if(currentSum < 0){

                currentSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Max Sum: "+maxSum);
        System.out.println("Subarray Index: "+start+" to "+end);
    }

    public static void main(String[] args){

        int arr[]={-2,1,-3,4,-1,2,1,-5,4};

        maxSubarray(arr);
    }
}