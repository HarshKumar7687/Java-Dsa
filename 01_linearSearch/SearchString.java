public class SearchString {
    public static void main(String[] args) {
        String name = "Alok";
        char target = 'k';
        System.out.println("Element found at index : " + LinearSearch(name, target));
    }
    public static int LinearSearch(String str, char target) {
        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return -1;
    }
}