public class Leetcode_2114_Maximum_Number_of_Words_Found_in_Sentences {
    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String sentence:sentences){
            int count = 0;
            for(int j=0;j<sentence.length();j++){
                if(sentence.charAt(j)==' '){
                    count++;
                }
            }
            if(count>max){
                max=count;
            }
        }
        return max+1;
    }
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
