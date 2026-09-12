//leetcode 1920. Build Array from Permutation
public class BuildArrayFRomPermutation {
    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            result[i]=nums[nums[count]];
            count++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] result = buildArray(nums);
        System.out.print("Build array from permutation: ");
        for(int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
