package org.example.basics;

public class Conditionals {
    public static void main(String[] args) {
        boolean isActive = true;
        //variable edad de un usuario con la minima memoria posible
        //Imprimir el usuario si es mayor de edad (18 o +)
        //Imprimir el usuario si es menor de edad (17 o -)
        byte age = 17;
        if (age >= 18){
            System.out.println("The user is an adult");
        } else{
            System.out.println("The user is a minor");
        }
    }
}
