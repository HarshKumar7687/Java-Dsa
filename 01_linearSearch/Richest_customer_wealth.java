//leetcode problem 1672

public class Richest_customer_wealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println("Maximum wealth is : " + maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int richest = 0;
        for(int person=0;person<accounts.length;person++){
            int current_customer = 0;
            for(int account_of_person=0;account_of_person<accounts[person].length;account_of_person++){
                current_customer = current_customer + accounts[person][account_of_person];
            }
            if(current_customer>richest){
                richest = current_customer;
            }
        }
        return richest;
    }
}
