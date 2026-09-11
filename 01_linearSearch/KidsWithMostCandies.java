import java.util.ArrayList;
import java.util.List;

public class KidsWithMostCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max) max = candies[i];
        }
        for(int i = 0;i<candies.length;i++){
            if((candies[i] + extraCandies) >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);
        System.out.print("Kids with most candies: ");
        for(Boolean res : result) {
            System.out.print(res + " ");
        }
        System.out.println();
    }
}
