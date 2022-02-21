package com.company;

public class Main {

    public static void main(String[] args) {

        balanced(" ");
        balanced("xxxyyy");
        balanced("yyyxxx");
        balanced("xxxyyyy");
        balanced("yyxyxxyxxyyyyxxxyxyx");
        balanced("xyxxxxyyyxyxxyxxyy");
        balanced("");
        balanced("x");
    }

    private static void balanced(String x) {
        if (x == "") System.out.println("True");

        else {
            int countx=0;
            int county=0;
            if(x.length() % 2 != 0 ) System.out.println("False");
            else {
                for (int i = 0; i <= x.length() - 1; i++) {

                    if (x.charAt(i) == 'x') countx++;
                    else county++;
                }


                if (countx == county) System.out.println("True");
                else System.out.println("False");
            }


            }
        }
    }
