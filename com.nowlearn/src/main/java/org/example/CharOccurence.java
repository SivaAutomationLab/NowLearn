package org.example;

public class CharOccurence {
    public static void main(String[] args) {
        String s = "aaabbbccc";
        int count = 1;
        int len = s.length();
        System.out.println(len+ " " +"so index will be until 8");
        char[] ch = s.toCharArray();

        for (int i = 0; i < s.length() - 1; i++) {



            if (ch[i] == ch[i + 1])
            //if(s.charAt(i)  == s.charAt(i+1))
            {
                count = count + 1;

            } else {
                System.out.println(count + " " + ch[i]);
                count = 1;
            }

        }System.out.print(count + "" + s.charAt(s.length() - 1));


   /*     String str = "aabbbccddbbb";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                System.out.print(count + "" + str.charAt(i));
                count = 1;
            }
        }
        System.out.print(count + "" + str.charAt(str.length() - 1));
    }*/
    }
}
