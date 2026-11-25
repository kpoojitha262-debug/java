
class Solution {
    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return 1;
        }

        int[] sa = buildSuffixArray(nums);
        int[] lcp = buildLCP(nums, sa);

        int ans = n;

        for (int i = 0; i < n; i++) {
            int maxLcp = 0;

            if (i > 0) {
                maxLcp = Math.max(maxLcp, lcp[i - 1]);
            }

            if (i < n - 1) {
                maxLcp = Math.max(maxLcp, lcp[i]);
            }

            int uniqueLength = maxLcp + 1;
            int suffixLength = n - sa[i];

            if (uniqueLength <= suffixLength) {
                ans = Math.min(ans, uniqueLength);
            }
        }

        return ans;
    }

    private int[] buildSuffixArray(int[] nums) {
        int n = nums.length;

        int[] sa = new int[n];
        int[] rank = new int[n];

        int maxValue = 0;

        for (int i = 0; i < n; i++) {
            sa[i] = i;
            rank[i] = nums[i];
            maxValue = Math.max(maxValue, nums[i]);
        }

        int classes = maxValue + 1;

        for (int k = 1; k < n; k *= 2) {

            int[] temp = countingSort(sa, rank, k, classes);

            sa = countingSort(temp, rank, 0, classes);

            int[] newRank = new int[n];
            int newClasses = 1;

            newRank[sa[0]] = 0;

            for (int i = 1; i < n; i++) {
                int curr = sa[i];
                int prev = sa[i - 1];

                int currSecond =
                    curr + k < n ? rank[curr + k] : -1;

                int prevSecond =
                    prev + k < n ? rank[prev + k] : -1;

                if (rank[curr] != rank[prev] ||
                    currSecond != prevSecond) {
                    newClasses++;
                }

                newRank[curr] = newClasses - 1;
            }

            rank = newRank;
            classes = newClasses;

            if (classes == n) {
                break;
            }
        }

        return sa;
    }

    private int[] countingSort(
        int[] input,
        int[] rank,
        int offset,
        int maxKey
    ) {
        int n = input.length;

        int[] count = new int[maxKey + 1];
        int[] output = new int[n];

        for (int index : input) {
            int key = index + offset < n
                ? rank[index + offset] + 1
                : 0;

            count[key]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int index = input[i];

            int key = index + offset < n
                ? rank[index + offset] + 1
                : 0;

            output[--count[key]] = index;
        }

        return output;
    }

    private int[] buildLCP(int[] nums, int[] sa) {
        int n = nums.length;

        int[] position = new int[n];
        int[] lcp = new int[n - 1];

        for (int i = 0; i < n; i++) {
            position[sa[i]] = i;
        }

        int h = 0;

        for (int i = 0; i < n; i++) {
            int r = position[i];

            if (r == n - 1) {
                h = 0;
                continue;
            }

            int j = sa[r + 1];

            while (i + h < n &&
                   j + h < n &&
                   nums[i + h] == nums[j + h]) {
                h++;
            }

            lcp[r] = h;

            if (h > 0) {
                h--;
            }
        }

        return lcp;
    }
}
