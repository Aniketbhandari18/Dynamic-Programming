class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();

        int[] prev = new int[n2 + 1];

        for (int i = 1; i <= n1; i++){
            int[] curr = new int[n2 + 1];

            for (int j = 1; j <= n2; j++){
                if (text1.charAt(i - 1) == text2.charAt(j - 1)){
                    curr[j] = 1 + prev[j - 1];
                    continue;
                }
                curr[j] = Math.max(prev[j], curr[j - 1]);
            }

            prev = curr;
        }

        return prev[n2];
    }
}
