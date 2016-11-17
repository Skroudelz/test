package com.company;


public class TestTenta {

    private int[] a = {8, 8, 2, 2, 2, 2, 8, 8, 1, 2, 8, 8,};
    private int[] b = {1, 2, 2, 2, 2, 2, 8, 8, 8, 8, 8, 8,};

    private int mostInARow(int[] pelle) {
        int numberOff = 0;
        int digit = 0;

        for (int i = 0; i < pelle.length; i++) {
            int count = i;

            while (pelle[i] == pelle[count]) {
                if (count - i > numberOff) {
                    digit = pelle[i];
                    numberOff++;
                }
                    if (count < pelle.length-1) {
                        count++;
                    } else{
                        break;
                    }
            }
        }
        return digit;
    }

    public void printA() {
        System.out.println(mostInARow(a));
    }
}
