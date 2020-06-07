package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        for (int x=2;x<=s;x++)
            if (isPrime(x)==true)
                System.out.println(x);
    }
    public static boolean isPrime(int n){
        for (int i = 2; i<n;i++){
            if (n%i==0)
                return false;
        }
        return true;
    }

}
