package com.company;

public class Main {


    public static void main(String[] args) {

        lettersum("");
        lettersum("a");
        lettersum("z");
        lettersum("cab");
        lettersum("excellent");
        lettersum("microspectrophotometries");
        

    }


    private static void lettersum(String words) {
        int count = words.length();
        int result = 0;
     if(words == ""){System.out.println(0); }
     else{
         for(int i = 0 ; i < words.length() ; i++){
             char buffor = words.charAt(i);
             result += (int) buffor - 65 - 31;


         }
    System.out.println(result);





     }


    }
}
