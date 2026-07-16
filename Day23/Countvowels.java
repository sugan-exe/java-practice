package Day23;
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {

        int n = words.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            String w = words[i];
            char first = w.charAt(0);
            char last = w.charAt(w.length() - 1);

            boolean ok = "aeiou".indexOf(first) != -1 &&
                         "aeiou".indexOf(last) != -1;

            prefix[i + 1] = prefix[i] + (ok ? 1 : 0);
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            ans[i] = prefix[queries[i][1] + 1] - prefix[queries[i][0]];
        }

        return ans;
    }
}