package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        System.out.println(recursionFucn(num));



    }

    static int recursionFucn(int number) {
        int res;
        if (number == 0 || number ==1){
            return number;
        }else {
            res = number * recursionFucn(number-1);
            return res;

        }

    }
}
