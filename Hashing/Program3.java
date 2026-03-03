import java.util.*;

class HashingDemo3 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {1,14,8,6,9,4};
        int target = 13;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}