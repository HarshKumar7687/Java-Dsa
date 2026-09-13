//leetcode 2011. Final Value of Variable After Performing Operations
public class Leetcode_2011_Final_Value_of_Variable_After_OPerations {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        int finalValue = finalValueAfterOperations(operations);
        System.out.println("Final value of x: " + finalValue);
    }
}
