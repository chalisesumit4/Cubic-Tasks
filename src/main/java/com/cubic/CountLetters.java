package com.cubic;

public class CountLetters {

    public static void main(String[] args)
    {
        findDuplicate();
    }

    public static void findDuplicate() {
        String s = "aaabbbbccccc";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            System.out.print(s.charAt(i) + "" + count);
            String trim = String.valueOf(s.charAt(i)).trim();
            s = s.replaceAll(trim, "");
            count = 0;
        }
    }

}
