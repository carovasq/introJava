package org.example.scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //No need for {}

        String user;
        String pw;
        byte i = 1;
        int maxAttempts = 3;

        while (i <= maxAttempts){
            System.out.println("Username: ");
            user = sc.nextLine();
            System.out.println("Password: ");
            pw = sc.nextLine();

            if(user.equals("admin") && pw.equals("1234")){
                System.out.println("Login success!");
                break;
            }

            if(i == maxAttempts){
                System.out.println("Max attempts exceeded :(");
            }
            i++;
        }
        sc.close();
    }
}
