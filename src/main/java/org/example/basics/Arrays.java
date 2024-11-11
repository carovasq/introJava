package org.example.basics;

public class Arrays {
    public static void main(String[] args) {
        //Definir un array de 5 nº (lleno)
        //Un array de 5 nombres de ciudades (llenos)
        //Con 2 forEach, imprimir todas las lineas de los nº y todas las cities
        int[] numbers = {1, 2, 3, 4, 5};
        String[] cities = {"Valencia", "Málaga", "Tokyo", "Madrid", "Sevilla"};

        for (int numb: numbers){
            System.out.println("Numbers: " + numb);
        }
        for (String city: cities){
            System.out.println("Cities: " + city);
        }
    }
}
