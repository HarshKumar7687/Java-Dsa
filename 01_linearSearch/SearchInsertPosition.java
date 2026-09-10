public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int index = searchInsert(nums, target);
        System.out.println("Index to insert: " + index);
    }
}
