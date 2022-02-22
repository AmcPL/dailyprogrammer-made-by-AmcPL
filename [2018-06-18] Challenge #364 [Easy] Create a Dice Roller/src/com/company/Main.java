package com.company;

public class Main {

    public static void main(String[] args) {
	roll("5d12");
	roll("6d4");
	roll("1d2");
	roll("3d6");
	roll("4d20");
	roll("10d100");
	roll("0d100");
	roll("0d0");
	roll("0e0");
    }

    private static void roll(String dice) {
        if (dice.contains("d")) {
            String[] part = dice.split("d");
            int count1 = Integer.parseInt(part[0]);
            int count2 = Integer.parseInt(part[1]);
            int [] rollresult = new int[count1];
            if ((count1 !=0)  && (count2 != 0)) {
                int result = 0;
                for (int i = 0; i < count1; i++) {
                    int rand = (int) (Math.random() * count2) + 1;
                    result += rand;
                    rollresult[i]=rand;
                }
                System.out.println("some number between " + count1 + " and " + (count1 * count2) + ", your result is " + result +" Your rolls throws are below :");
                System.out.println(Showroll(rollresult));

            }

            else
                System.out.println("Error");
        }

        else System.out.println("Error");
    }

    private static String Showroll(int[] rollresult) {
        for (int i = 0; i < rollresult.length; i++) {
            System.out.print(rollresult[i]+" ");
        }
        return " ";
    }

}
