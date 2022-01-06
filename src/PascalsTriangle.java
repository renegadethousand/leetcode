import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        System.out.println(pascalsTriangle.generate(5));
        System.out.println(pascalsTriangle.generate(1));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> currentList = new ArrayList<>();
            if (i == 0 || i == 1) {
                for (int j = 0; j <= i; j++) {
                    currentList.add(1);
                }
            } else {
                List<Integer> previousList = result.get(i - 1);
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        currentList.add(1);
                    } else {
                        currentList.add(previousList.get(j - 1) + previousList.get(j));
                    }
                }
            }
            result.add(currentList);
        }
        return result;
    }
}
