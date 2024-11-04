public class CountFrequence {
    public String counting(String text) {
        int[] freq_lower = new int[26];
        int[] freq_upper = new int[26];
        StringBuilder res = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    freq_upper[c - 'A']++;
                } else {
                    freq_lower[c - 'a']++;
                }
            }
        }
        for (int i = 0; i < freq_lower.length; i++) {
            char upper_letter = (char) (i + 'A');
            char lower_letter = (char) (i + 'a');
            res.append(upper_letter).append(" ").append(freq_upper[i]).append("\n");
            res.append(lower_letter).append(" ").append(freq_lower[i]).append("\n");
        }
        return res.toString();
    }
}