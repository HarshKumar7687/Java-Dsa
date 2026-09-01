public class Min_element_in_array {
    public static void main(String[] args) {
        int[] arr = {17, 3, 5, 10, 2, 4, 6};
        System.out.println("Minimum element is : " + findMin(arr));
    }
    static int findMin(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
