public class Search_in_2D_array {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6,10},
                {7, 8, 9}
        };
        int target = 10;
        int[] result = search(arr, target);
        if (result[0] == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at: (" + result[0] + ", " + result[1] + ")");
        }
    }
    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

//38:00