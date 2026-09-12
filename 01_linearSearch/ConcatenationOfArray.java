public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int count =0;
        int[] result = new int[2*nums.length];
        for(int num:nums){
            result[count] = num;
            count++;
        }
        for(int num:nums){
            result[count] = num;
            count++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] result = getConcatenation(nums);
        System.out.print("Concatenation of array: ");
        for(int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
