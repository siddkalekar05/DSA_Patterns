class LeadersArray {

    public static void main(String[] args) {

        int[] arr = {16,17,4,3,5,2};

        int maxRight = arr[arr.length-1];

        System.out.print("Leaders: " + maxRight + " ");

        for(int i = arr.length-2; i >=0; i--){

            if(arr[i] > maxRight){

                maxRight = arr[i];

                System.out.print(maxRight + " ");
            }
        }
    }
}
