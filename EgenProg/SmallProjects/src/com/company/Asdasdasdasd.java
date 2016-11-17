package com.company;

/**
 * Created by lenovo on 2016-10-18.
 */
public class Asdasdasdasd {

   int [] unsorted = {8, 8, 2, 2, 2, 2, 8, 8, 1, 2, 8, 8};

    int mostInARow(int[] a){
        int c = 1;
        int tempC = 1;
        int cNum = 0;

        for(int i = 1; i < a.length; i++) {
            if(tempC > c) {
                c = tempC;
                cNum = a[i-1];
            }

            if(a[i] == a[i - 1]){
                tempC++;
            }
            else{
                tempC = 1;
            }

        }
        return cNum;
    }
}
