class Solution {

    List<Integer> ans = new ArrayList<>();

    public List<Integer> lexicalOrder(int n) {

        for (int i = 1; i <= 9; i++) {
            create(i, n);
        }

        return ans;
    }

    public void create(int num, int n) {

        if (num > n)
            return;

        ans.add(num);

        num = num * 10;

        for (int i = 0; i <= 9; i++) {
            create(num + i, n);
        }
    }
}