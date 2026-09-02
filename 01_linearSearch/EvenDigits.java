//leetcode problem 1295

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        System.out.println("Count of numbers with even digits is : " + findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int num: nums){
            int no_of_digits = 0;
            //int no_of_digits=(int)Math.log10(num)+1;
            while(num!=0){
                no_of_digits++;
                num=num/10;
            }
            if(no_of_digits%2==0){
                count++;
                no_of_digits=0;
            }
        }
        return count;
    }
}