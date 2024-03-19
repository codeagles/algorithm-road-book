package com.codeagles.strings;

import java.util.HashMap;

public class LC3 {
    public static void main(String[] args) {
        LC3 lc3 = new LC3();
        System.out.println(lc3.lengthOfLongestSubstring("abcba"));
    }
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0, start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }
            map.put(c, i);
            max = Math.max(max, i - start +1);


        }
        return max;
    }
}
