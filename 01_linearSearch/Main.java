//Linear Search is used to search for elements in an array it returns it index
public class Main {
    public static void main(String[] args) {
        int[] arr = {17,3,5,10};
        int target = 17;
        System.out.println("Element found at index : "+LinearSearch(arr,target));
    }
    static int LinearSearch(int[] arr, int target){
        if(arr.length == 0)  {
            return -1;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]==target){
                return  i;
            }
        }
        return -1;
    }
}