class Solution {
    public boolean findPattern(String s) {
        int i = 0;
        int n = s.length();

        while (i < n) {
            int xCount = 0;
            int yCount = 0;

            while (i < n && s.charAt(i) == 'x') {
                xCount++;
                i++;
            }

            while (i < n && s.charAt(i) == 'y') {
                yCount++;
                i++;
            }

            if (xCount == 0 || xCount != yCount) {
                return false;
            }
        }

        return true;
    }
}
