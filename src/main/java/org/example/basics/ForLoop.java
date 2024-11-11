package org.example.basics;

public class ForLoop {
    public static void main(String[] args) {
        //imprimir por consola los nº de 5 a 10, con for
        for (int numbers = 5; numbers <= 10; numbers++){
            System.out.println("Numbers with For: " + numbers);
        }

        //Imprimir nº pares del 5 al 10, con for
        for (int numbers = 5; numbers <= 10; numbers++){
            if(numbers % 2 == 0){
                System.out.println("Numbers pares with For: " + numbers);
            }
        }

        //imprimir nº de 5 a 10 con while
        int i = 5;
        while(i <= 10){
            System.out.println("Nº with While: " + i);
            i++;
        }

        //Imprimir nº impares con while
        int c = 5;
        while(c <= 10){
            if(c % 2 != 0){
                System.out.println("Nº impares with While: " + c);
            }
            c++;
        }
    }
}
