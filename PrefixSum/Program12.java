class GreaterThanAverage {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int sum = 0;

        for(int num : arr)
            sum += num;

        double avg = sum / arr.length;

        int count = 0;

        for(int num : arr){

            if(num > avg)
                count++;
        }

        System.out.println("Count: " + count);
    }
}