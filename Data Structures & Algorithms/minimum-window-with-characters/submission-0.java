
class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] need = new int[128];
        int[] window = new int[128];

        // Count the required characters
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int required = 0;

        for (int count : need) {
            if (count > 0) {
                required++;
            }
        }

        int formed = 0;
        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        // Expand the window using right
        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);
            window[c]++;

            // A required character has reached
            // its required frequency
            if (need[c] > 0 && window[c] == need[c]) {
                formed++;
            }

            // Shrink while the window is valid
            while (formed == required) {

                int len = right - left + 1;

                // Save the shortest valid window
                if (len < minLen) {
                    minLen = len;
                    start = left;
                }

                // Remove the leftmost character
                char removed = s.charAt(left);
                window[removed]--;

                // Check whether the window became invalid
                if (need[removed] > 0 &&
                    window[removed] < need[removed]) {
                    formed--;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}
