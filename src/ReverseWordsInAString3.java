public class ReverseWordsInAString3 {

    public static void main(String[] args) {
        ReverseWordsInAString3 reverseWordsInAString3 = new ReverseWordsInAString3();
        System.out.println(reverseWordsInAString3.reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWordsInAString3.reverseWords("God Ding"));
    }

    public String reverseWords(String s) {
        StringBuilder newString = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            boolean endWord = false;
            if (currentChar != ' ') {
                currentWord.append(currentChar);
            } else {
                endWord = true;
            }

            if (i == s.length() - 1) {
                endWord = true;
            }

            if (endWord) {
                char[] chars = currentWord.toString().toCharArray();
                for (int j = 0; j < chars.length / 2; j++) {
                    char buffer = chars[chars.length - 1 - j];
                    chars[chars.length - 1 - j] = chars[j];
                    chars[j] = buffer;
                }
                newString.append(chars);
                if (i < s.length() - 1) {
                    newString.append(currentChar);
                }

                currentWord.delete(0, currentWord.length());
            }
        }
        return newString.toString();
    }
}
