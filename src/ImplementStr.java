public class ImplementStr {
    public static void main(String[] args) {
        ImplementStr implementStr = new ImplementStr();
        System.out.println(implementStr.strStr("hello", "ll"));
        System.out.println(implementStr.strStr("aaaaa", "bba"));
        System.out.println(implementStr.strStr("", ""));
    }

    public int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.length() - i >= needle.length()) {
                    boolean equals = true;
                    for (int j = 0; j < needle.length(); j++) {
                        if (haystack.charAt(i + j) != needle.charAt(j)) {
                            equals = false;
                        }
                    }
                    if (equals) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
