public class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(validPalindrome.isPalindrome("race a car"));
        System.out.println(validPalindrome.isPalindrome(" "));
    }

    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("[^0-9a-z]", "").replace(" ", "");
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s1.charAt((s1.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }
}
