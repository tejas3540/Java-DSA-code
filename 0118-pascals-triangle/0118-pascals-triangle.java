import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
            List<Integer> row = new ArrayList<>(rowIndex + 1);
            row.add(1);

            if (rowIndex > 0) {
                List<Integer> previous = triangle.get(rowIndex - 1);

                for (int col = 1; col < rowIndex; col++) {
                    row.add(previous.get(col - 1) + previous.get(col));
                }

                row.add(1);
            }

            triangle.add(row);
        }

        return triangle;
    }
}