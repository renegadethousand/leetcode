public class LengthOfLastWord {

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord2("Hello World"));
        System.out.println(lengthOfLastWord.lengthOfLastWord2("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord.lengthOfLastWord2("luffy is still joyboy"));
    }

    public int lengthOfLastWord(String s) {
        String[] stringList = s.trim().replace("  ", " ").split(" ");
        System.out.println("The last word is " + stringList[stringList.length - 1] + " with length " + stringList.length + ".");
        return stringList[stringList.length - 1].length();
    }

    public int lengthOfLastWord2(String s) {
        int length = 0;

        // We are looking for the last word so let's go backward
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // a letter is found so count
                length++;
            } else {  // it's a white space instead
                //  Did we already started to count a word ? Yes so we found the last word
                if (length > 0) return length;
            }
        }
        return length;
    }
}
