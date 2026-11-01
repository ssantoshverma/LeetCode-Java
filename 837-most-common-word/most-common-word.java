class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        String[] arr = paragraph.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : arr) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        HashSet<String> ban = new HashSet<>();

        for (String word : banned) {
            ban.add(word.toLowerCase());
        }

        int max = 0;
        String ans = "";

        for (String word : map.keySet()) {

            int freq = map.get(word);

            if (freq > max && !ban.contains(word)) {
                max = freq;
                ans = word;
            }
        }

        return ans;
    }
}