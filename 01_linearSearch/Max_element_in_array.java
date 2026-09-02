public class Max_element_in_array {
    public static void main(String[] args) {
        int[] arr = {17, 3, 5, 10, 2, 4, 6};
        System.out.println("Maximum element is : " + findMax(arr));
    }
    static int findMax(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
