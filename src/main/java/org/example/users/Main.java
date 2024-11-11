package org.example.users;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Carolay", "Vasquez");
        User user2 = new User("Eustaquia", "Sánchez");
        User user3 = new User("Alberta", "Gómez");

        user1.printFullName();

        System.out.println("2º método: " + user1.fullName());

        //Con bucle, imprime los fullname de 3 usuarios diferentes
        //Almacena los users objetcs con un array
        User[] users = {user1, user2, user3};
        for(User user: users){
            System.out.println("Users: " + user.fullName());
        }
    }
}
