package com.mycompany.desafio01;

public class Desafio01 {
    public static void main(String[] args) {
        long n = 0;
        long rev = 0;
        
        for (int i = 1; i <= 1000000; i++) {
            n = i;
            rev = reverso(n);
            
            if (n % 10 == 0)
                continue;
            else if ((n + rev) % 2 == 0)
                continue;
            else if ((n + rev) >= 1000000)
                continue;
            else
                System.out.println(n + " + " + rev + " = " + (n + rev));
            
        }
    }
    
    public static long reverso(long n){
        long reverso = 0;
        
        while(n != 0){
            reverso = reverso * 10 + n % 10;
            n = n / 10;
        }
        return reverso;
    }
}
