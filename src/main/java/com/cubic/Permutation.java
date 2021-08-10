package com.cubic;
public class Permutation {

    public static void main(String[] args)
    {
        String s = "abc";
        permutation(s, "");
    }

    //------------------

    public static void permutation(String str, String out)
    {
        if (str.length() == 0) {
            System.out.print(out + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            permutation(ros, out + ch);
        }
    }
}