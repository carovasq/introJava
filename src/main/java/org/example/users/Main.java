package org.example.users;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Carolay", "Vasquez");

        //Utilizando Algun bucle, imprime los fullname de 3 usuarios diferentes

//        user1.printFullName();
        System.out.println(user1.fullName());
    }
}
