
class Solution {
    public int lengthOfLongestSubstring(String s) {
            int maxLength = 0;
                    int left = 0;
                            Map<Character, Integer> lastSeen = new HashMap<>();

                                    for (int right = 0; right < s.length(); right++) {
                                                char currentChar = s.charAt(right);

                                                            // If the character was seen inside the current window, move the left pointer past it
                                                                        if (lastSeen.containsKey(currentChar) && lastSeen.get(currentChar) >= left) {
                                                                                        left = lastSeen.get(currentChar) + 1;
                                                                                                    }

                                                                                                                // Update the last seen index of the character
                                                                                                                            lastSeen.put(currentChar, right);

                                                                                                                                        // Calculate current window length
                                                                                                                                                    maxLength = Math.max(maxLength, right - left + 1);
                                                                                                                                                            }

                                                                                                                                                                    return maxLength;
                                                                                                                                                                        }
                                                                                                                                                                        }

