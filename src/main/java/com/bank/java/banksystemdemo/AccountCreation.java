package com.bank.java.banksystemdemo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AccountCreation extends Client implements Account {
    Scanner scanner;
    private static int count = 0;
    ArrayList<ArrayList<Object>> accounts;
    ArrayList<Object> clients;
    Random random;
    int isExist;
    int choice;

    public AccountCreation() {
        accounts = new ArrayList<>();
        random = new Random();
        clients = new ArrayList<>();
    }

    public AccountCreation(int id, String firstName, String lastName, String email, String phone, String address, String accType, String password, String cardNumber) {
        super(id, firstName, lastName, email, phone, address, accType, password, cardNumber);
    }


    public void StartScreen() {
        System.out.println("Welcome to the Bank System Demo");
        System.out.println("do u have an account ?");
        System.out.println("1-YES\n2-NO");
        scanner = new Scanner(System.in);
        isExist = scanner.nextInt();

        if (isExist == 1) {
            panel();
        } else if (isExist == 2) {
            createAccount();
        }
    }

    public void panel() {
        System.out.println("Welcome " + accounts.stream().filter(client -> clients.get(0).equals(getId()))
                .toList().stream().map(client -> client.get(1)).findFirst().orElse("not found"));

        do {
            System.out.println(" 1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount\n 5. Exit ");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(toString());
                    break;
                    case 2:
                        System.out.println("Enter account number: ");
                        int accountNumber = scanner.nextInt();

                        break;



            }
        } while (choice != 5);
    }

    @Override
    public void login(String email, int password) {

    }


    @Override
    public void createAccount() {
        setId(++count);
        scanner = new Scanner(System.in);
        System.out.println("Please enter your first name");
        setFirstName(scanner.next());
        System.out.println("Please enter your last name");
        setLastName(scanner.next());
        System.out.println("Please enter your email");
        setEmail(scanner.next());
        System.out.println("Please enter your phone number");
        setPhone(scanner.next());
        System.out.println("Please enter your address");
        setAddress(scanner.next());
        System.out.println("Please enter your account type");
        setAccType(scanner.next());
        System.out.println("Please enter your password");
        setPassword(scanner.next());

        String bin = String.format("%04d", random.nextInt(10000));

        setCardNumber(generate(bin, 12));
        AccountCreation accountCreation = new AccountCreation(getId(), getFirstName(), getLastName(), getEmail(), getPhone(), getAddress(), getAccType(), getPassword(), getCardNumber());


        clients.add(getId());
        clients.add(getFirstName());
        clients.add(getLastName());
        clients.add(getEmail());
        clients.add(getPhone());
        clients.add(getAddress());
        clients.add(getAccType());
        clients.add(getPassword());
        clients.add(getCardNumber());
        accounts.add(clients);
        System.out.println("Account created");
        panel();
    }

    @Override
    public boolean logout() {
        return false;
    }


}

//        for (int i = 0; i < accounts.size(); i++) {
//            for (int j = 0; j < accounts.get(i).size(); j++) {
//                if (accounts.get(i).get(0).equals(1)) {
//                    System.out.println("welcome "+accounts.get(i).get(1));
//                    break;
//                }
//            }
//        }