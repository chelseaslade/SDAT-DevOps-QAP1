package org.keyin;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankUser testUser1 = new BankUser("Pip", "Cat");
        BankUser testUser2 = new BankUser("Suki", "Dog");
        BankUser testUser3 = new BankUser("Bif", "Cat");

        System.out.println(testUser1.toString());
        System.out.println(testUser2.toString());
        System.out.println(testUser3.toString());

        HashMap<String, Integer> bankAccounts = new HashMap<String, Integer>();

        //Main Menu Loop
        boolean mainMenuLoop = true;

        System.out.println("CLI Simple Banking Application");
        System.out.println("Select an option from the menu below: (1, 2, or 3) ");
        System.out.println("1. Create Account");
        System.out.println("2. Access Existing Account");
        System.out.println("3. Exit");

        int mainMenuSelect = sc.nextInt();
        sc.nextLine();

        if (mainMenuSelect == 1)
        {
            System.out.println("Create an Account");
            System.out.println("Enter users first name: ");
            String fName = sc.nextLine();
            System.out.println("Enter users last name: ");
            String lName = sc.nextLine();

            BankUser newUser = new BankUser(fName, lName);
            bankAccounts.put(newUser.getFullName(), newUser.getId());
            System.out.println(newUser.toString());
        }
        else if (mainMenuSelect == 2)
        {
            System.out.println("Access an Existing Account");
            System.out.println("Enter the ID of the user.");
            int id = sc.nextInt();
            sc.nextLine();

            //Secondary Loop
            boolean accessLoop = true;

            //Banking Menu
            System.out.println("Select an option below: ");
            System.out.println("1. View Account Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit to Main Menu");

            int optionSelect = sc.nextInt();
            sc.nextLine();

            switch (optionSelect) {
                case 1: {
                    System.out.println("Account Balance: ");
                }
                case 2: {
                    System.out.println("Deposit Funds: ");
                }

                case 3: {
                    System.out.println("Withdraw Funds: ");
                }

                case 4: {
                    accessLoop = false;
                }
            }

        }
        else if (mainMenuSelect == 3)
        {
            mainMenuLoop = false;
        }
    }
}