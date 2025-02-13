import java.util.HashMap;

class twosum2 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = { 0, 0 };
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int[] ans=twoSum(arr, 9);
        for (int var : ans)
            System.out.print(var + " ");
    }
}