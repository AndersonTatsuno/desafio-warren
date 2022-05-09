package com.mycompany.desafio02;

public class Desafio02 {
    public static void main(String[] args) {
        int x = 3;
        int[] tempoChegada = {-2, -1, 0, 1, 2};
        
        cancelaAula(x, tempoChegada);
    }
    
    public static void cancelaAula(int x, int[] tChegada){        
        if (tChegada[x - 1] <= 0)
            System.out.println("Aula normal.");
        else
            System.out.println("Aula cancelada.");
        
    }
}
