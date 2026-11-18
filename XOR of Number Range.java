class Solution {
    public static int findXOR(int l, int r) {

        int a = xor(r);
        int b = xor(l - 1);

        return a ^ b;
    }

    static int xor(int n) {

        if (n % 4 == 0)
            return n;

        else if (n % 4 == 1)
            return 1;

        else if (n % 4 == 2)
            return n + 1;

        else
            return 0;
    }
}
