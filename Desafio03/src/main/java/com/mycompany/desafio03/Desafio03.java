package com.mycompany.desafio03;

import java.util.ArrayList;
import java.util.List;

public class Desafio03 {
    public static void main(String[] args) {
        int[] V = {2, 3, 4};
        int N = 10;
        
        menorNumElementos(V, N);
    }
    
    public static void menorNumElementos(int[] V, int N){
        int cont = 0;
        String indice = "";
        
        ArrayList<Integer> menores = new ArrayList<>();
        
        for (int i = 0; i < V.length; i++) {            
            if(cont<10){
                cont += V[i];
                indice += String.valueOf(i);
            } else if (cont == 10){
                menores.add(Integer.parseInt(indice));
                i = 1;
            } else if (i == V.length){
                i = 0;
            }
        }
        
        indice = "";
        
        if (V[0] * 2 + V[1] == 10){
            indice += String.valueOf(V[0]);
            indice += String.valueOf(V[0]);
            indice += String.valueOf(V[1]);
            menores.add(Integer.parseInt(indice));
            indice = "";
        }else if (V[0] * 2 + V[2] == 10) {
            indice += String.valueOf(V[0]);
            indice += String.valueOf(V[0]);
            indice += String.valueOf(V[2]);
            menores.add(Integer.parseInt(indice));
            indice = "";
        } else if (V[1] * 2 + V[0] == 10){
            indice += String.valueOf(V[1]);
            indice += String.valueOf(V[1]);
            indice += String.valueOf(V[0]);
            menores.add(Integer.parseInt(indice));
            indice = "";
        } else if (V[1] * 2 + V[2] == 10){
            indice += String.valueOf(V[1]);
            indice += String.valueOf(V[1]);
            indice += String.valueOf(V[2]);
            menores.add(Integer.parseInt(indice));
            indice = "";
        } else if (V[2] * 2 + V[0] == 10){
            indice += String.valueOf(V[2]);
            indice += String.valueOf(V[2]);
            indice += String.valueOf(V[0]);
            menores.add(Integer.parseInt(indice));
            indice = "";
        } else if (V[2] * 2 + V[1] == 10){
            indice += String.valueOf(V[2]);
            indice += String.valueOf(V[2]);
            indice += String.valueOf(V[1]);
            menores.add(Integer.parseInt(indice));
            indice = "";
        }
        
        indice = "";
        
        for (int i = 0; i < V.length; i++) {
            if (V[i] * 3 == 10) {
               indice += String.valueOf(i);
               indice += String.valueOf(i);
               indice += String.valueOf(i);
               menores.add(Integer.parseInt(indice));
               indice = "";
            }
        }
            
        for (int i = 0; i < menores.size(); i++) {
            System.out.println(menores);
        }
        
        
    }
}
