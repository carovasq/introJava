package org.example.basics;

public class Strings {
    public static void main(String[] args) {
        String name = "Carito";
        String surname = new String("Vasquez");
        String fullName = name + " " + surname;

        System.out.println(fullName);
        //Imprimir por consola una comparación de Strings
        String name0 = "Carolay";
        if(name.equals("Carolay")){
            System.out.println("Name is: " + name0);
        }
    }
}