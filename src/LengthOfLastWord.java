public class LengthOfLastWord {

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
    }

    public int lengthOfLastWord(String s) {
        String[] stringList = s.trim().replace("  ", " ").split(" ");
        System.out.println("The last word is " + stringList[stringList.length - 1] + " with length " + stringList.length + ".");
        return stringList[stringList.length - 1].length();
    }
}
