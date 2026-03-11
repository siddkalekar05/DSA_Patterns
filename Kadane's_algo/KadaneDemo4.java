class KadaneExample4 {

    static void maxSum(int arr[]){

        int current = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            current += arr[i];

            max = Math.max(max,current);

            if(current < 0)
                current = 0;
        }

        System.out.println("Maximum Sum: "+max);
    }

    public static void main(String[] args){

        int arr[]={1,-2,3,5,-1,2};

        maxSum(arr);
    }
}