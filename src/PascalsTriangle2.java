import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

    public static void main(String[] args) {
        PascalsTriangle2 pascalsTriangle = new PascalsTriangle2();
        System.out.println(pascalsTriangle.getRow(3));
        System.out.println(pascalsTriangle.getRow(0));
        System.out.println(pascalsTriangle.getRow(1));
    }

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();

        int numRows = rowIndex + 1;
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
        return result.get(rowIndex);
    }
}
