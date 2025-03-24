package org.example;

import java.util.Arrays;

public class SplitString {
    public static void main(String [] args){
        String s = "Siva is a good boy than Arun";
        //String []s = {Siva, is a good boy than Arun};
         String[] strArray= s.split(" ", 6);
        //System.out.println(Arrays.toString(strArray));

        for(String spl:strArray)
        {
            System.out.println(spl);
        }

        System.out.println("___________________________");
//        int [] n=  new int[2];
//        n[0] = 1;
//        n[1] = 2;
//       // System.out.println(Arrays.toString(n));
////        for(int i =0; i<n.length;i++)
////        {
////            System.out.print(n[i]+",");
////        }
//        for(int k: n){
//            System.out.println(k);
//        }


    }
}
