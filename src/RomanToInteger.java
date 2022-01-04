import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));
        System.out.println(romanToInteger.romanToInt("LVIII"));
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }

    public int romanToInt(String s) {
        Map<String, Integer> romanMap = new TreeMap<>();
        romanMap.put("M", 1000);
        romanMap.put("CM", 900);
        romanMap.put("D", 500);
        romanMap.put("CD", 400);
        romanMap.put("C", 100);
        romanMap.put("XC", 90);
        romanMap.put("L", 50);
        romanMap.put("XL", 40);
        romanMap.put("X", 10);
        romanMap.put("IX", 9);
        romanMap.put("V", 5);
        romanMap.put("IV", 4);
        romanMap.put("I", 1);

        List<String> romanList = new ArrayList<>();

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1) {
                if (romanMap.containsKey(s.substring(i, i + 2))) {
                    result += romanMap.get(s.substring(i, i + 2));
                    i++;
                    continue;
                }
                result += romanMap.get(s.substring(i, i + 1));
            } else {
                result += romanMap.get(s.substring(i, i + 1));
            }
        }
        return result;
    }
}
