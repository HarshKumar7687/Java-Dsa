//leetcode problem 1672

public class Richest_customer_wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println("Maximum wealth is : " + maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int richest = 0;
        for(int i=0;i<accounts.length;i++){
            int current_customer = 0;
            for(int j=0;j<accounts[i].length;j++){
                current_customer = current_customer + accounts[i][j];
            }
            if(current_customer>richest){
                richest = current_customer;
            }
        }
        return richest;
    }
}
