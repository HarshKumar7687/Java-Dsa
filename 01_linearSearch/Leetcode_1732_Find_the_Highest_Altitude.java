public class Leetcode_1732_Find_the_Highest_Altitude {
    public static int largestAltitude(int[] gain) {
        int currentAltitute = 0;
        int maxAltitude = 0;
        for(int i=0;i<gain.length;i++){
            currentAltitute = currentAltitute + gain[i];
            if(currentAltitute>maxAltitude){
                maxAltitude = currentAltitute;
            }
        }
        return maxAltitude;
    }
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
