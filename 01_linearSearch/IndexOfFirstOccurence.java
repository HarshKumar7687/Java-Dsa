public class IndexOfFirstOccurence {
    public static int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            String value = haystack.substring(i,i+needle.length());
            if(needle.equals(value)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int index = strStr(haystack, needle);
        System.out.println("Index of first occurrence: " + index);
    }
}
