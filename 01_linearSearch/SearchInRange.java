public class SearchInRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 4;
        int[] arr = {17, 3, 5, 10, 2, 4, 6};
        int target = 17;
        int ans = LinearSearch(arr, target, start, end);
        if(ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index : " + ans);
        }
    }
    static int LinearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
