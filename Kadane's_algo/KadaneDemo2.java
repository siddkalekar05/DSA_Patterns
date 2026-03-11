class KadaneExample2 {

    static void maxSum(int arr[]){

        int current = arr[0];
        int max = arr[0];

        for(int i=1;i<arr.length;i++){

            current = Math.max(arr[i], current + arr[i]);

            max = Math.max(max, current);
        }

        System.out.println(max);
    }

    public static void main(String[] args){

        int arr[]={1,2,3,4,5};

        maxSum(arr);
    }
}