package org.keyin;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, BankUser> bankAccounts = new HashMap<Integer, BankUser>();

        BankUser testUser1 = new BankUser("Pip", "Cat");
        testUser1.depositFunds(1000);
        bankAccounts.put(testUser1.getId(), testUser1);
        BankUser testUser2 = new BankUser("Suki", "Dog");
        testUser2.depositFunds(250);
        bankAccounts.put(testUser2.getId(), testUser2);
        BankUser testUser3 = new BankUser("Bif", "Cat");
        testUser3.depositFunds(500);
        bankAccounts.put(testUser3.getId(), testUser3);

        System.out.println(testUser1.toString());
        System.out.println(testUser2.toString());
        System.out.println(testUser3.toString());

        //Main Menu Loop
        boolean mainMenuLoop = true;
        while (mainMenuLoop = true) {
            System.out.println("CLI Simple Banking Application");
            System.out.println("Select an option from the menu below: (1, 2, or 3) ");
            System.out.println("1. Create Account");
            System.out.println("2. Access Existing Account");
            System.out.println("3. Exit");

            int mainMenuSelect = sc.nextInt();
            sc.nextLine();

            if (mainMenuSelect == 1) {
                System.out.println("Create an Account");
                System.out.println("Enter users first name: ");
                String fName = sc.nextLine();
                System.out.println("Enter users last name: ");
                String lName = sc.nextLine();

                BankUser newUser = new BankUser(fName, lName);
                bankAccounts.put(newUser.getId(), newUser);
                System.out.println(newUser.toString());
            } else if (mainMenuSelect == 2) {
                System.out.println("Access an Existing Account");
                System.out.println("Enter the ID of the user.");
                Integer id = sc.nextInt();
                sc.nextLine();

                BankUser selectedUser = bankAccounts.get(id);

                //Secondary Loop
                boolean accessLoop = true;

                //Banking Menu
                while (accessLoop = true) {
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
                            System.out.println(selectedUser.getBalance());
                            break;
                        }
                        case 2: {
                            System.out.println("Deposit Funds: ");
                            System.out.println("Enter the amount to deposit: ");
                            double amount = sc.nextDouble();
                            selectedUser.depositFunds(amount);

                            System.out.println("New Balance: " + selectedUser.getBalance());
                            break;
                        }

                        case 3: {
                            System.out.println("Withdraw Funds: ");
                            System.out.println("Enter the amount to withdraw: ");
                            double amount = sc.nextDouble();

                            if (selectedUser.getBalance() >= amount) {
                                selectedUser.withdrawFunds(amount);
                                System.out.println("New Balance: " + selectedUser.getBalance());
                            }
                            else {
                                System.out.println("Insufficient funds for withdrawal amount.");
                            }
                            break;
                        }

                        case 4: {
                            accessLoop = false;
                            break;
                        }
                    }
                    break;
                }
            } else if (mainMenuSelect == 3) {
                mainMenuLoop = false;
            }
        }
    }
}