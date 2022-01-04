public class LongestCommonPrefix {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(lcp.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(lcp.longestCommonPrefix(new String[]{"cir","car"}));
    }

    public String longestCommonPrefix(String[] strs) {
        int minLength = strs[0].length();

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

         StringBuilder stringBuilder = new StringBuilder();

         for (int i = 0; i < minLength; i++) {
            char currentLetter = strs[0].charAt(i);
            boolean letterEquals = true;

            for (int j = 0; j < strs.length; j++) {
                if (currentLetter != strs[j].charAt(i)) {
                    letterEquals = false;
                    break;
                }
            }

            if (letterEquals) {
                stringBuilder.append(currentLetter);
            } else {
                break;
            }
         }
        return stringBuilder.toString();
    }
}
