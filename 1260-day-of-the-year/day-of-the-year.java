
class Solution {
    public int dayOfYear(String date) {
        StringBuilder sb = new StringBuilder();
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder();

        s1.append(date.charAt(0));
        s1.append(date.charAt(1));
        s1.append(date.charAt(2));
        s1.append(date.charAt(3));

        int year = Integer.parseInt(s1.toString());

        sb.append(date.charAt(5));
        sb.append(date.charAt(6));
        int month = Integer.parseInt(sb.toString());

        s.append(date.charAt(8));
        s.append(date.charAt(9));
        int day = Integer.parseInt(s.toString());

        int ans = 0;

        for (int i = 1; i < month; i++) {
            if (i == 1 || i == 3 || i == 5 ||
                i == 7 || i == 8 || i == 10 || i == 12) {
                ans += 31;
            } else if (i == 4 || i == 6 ||
                       i == 9 || i == 11) {
                ans += 30;
            } else if (i == 2) {
                if (year % 400 == 0 ||
                    (year % 4 == 0 && year % 100 != 0)) {
                    ans += 29;
                } else {
                    ans += 28;
                }
            }
        }

        return ans + day;
    }
}
