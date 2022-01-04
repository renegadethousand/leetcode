public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(121));
        System.out.println(palindromeNumber.isPalindrome(-121));
        System.out.println(palindromeNumber.isPalindrome(10));
    }

    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        char[] charArray = value.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArray[(charArray.length - 1) - i]) {
                return false;
            }
        }
        return true;
    }
}
