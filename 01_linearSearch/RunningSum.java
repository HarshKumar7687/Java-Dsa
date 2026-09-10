public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int current = 0;
        for(int i=0;i<nums.length;i++) {
            current = current + nums[i];
            result[i] = current;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = runningSum(nums);
        System.out.print("Running sum: ");
        for(int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
