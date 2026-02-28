class TwoPointerDemo7 {

    public static void sum(int arr[]) {

        int target = 16;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int sum = arr[start] + arr[end];

            if (sum == target) {
                System.out.println("Pair found at index: " + start + " and " + end);
                start++;
                end--;
            }
            else if (sum < target) {
                start++; 
            }
            else {
                end--;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 4, 7, 9, 12, 13};
        sum(arr);
    }
}