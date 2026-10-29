
class Solution {
    static long Mod = 1_000_000_007L;

    public long factorial(int n) {
        long ans = 1;

        for (int i = 2; i <= n; i++) {
            ans = (ans * i) % Mod;
        }

        return ans;
    }

    // Binary exponentiation using Fermat's Little Theorem
    public long power(long a, long b) {
        long ans = 1;

        while (b > 0) {
            if (b % 2 == 1) {
                ans = (ans * a) % Mod;
            }

            a = (a * a) % Mod;
            b /= 2;
        }

        return ans;
    }

    public int countAnagrams(String str) {
        String[] arr = str.split(" ");
        long numerator = 1;
        long denominator = 1;

        for (int i = 0; i < arr.length; i++) {
            int n = arr[i].length();

            numerator = (numerator * factorial(n)) % Mod;

            String s = arr[i];
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = 0; j < s.length(); j++) {
                map.put(s.charAt(j),
                        map.getOrDefault(s.charAt(j), 0) + 1);
            }

            for (int freq : map.values()) {
                denominator =
                    (denominator * factorial(freq)) % Mod;
            }
        }

        // Modular inverse using Fermat's Little Theorem
        long inverse = power(denominator, Mod - 2);

        return (int) ((numerator * inverse) % Mod);
    }
}
