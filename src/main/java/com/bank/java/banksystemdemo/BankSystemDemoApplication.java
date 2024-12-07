package com.bank.java.banksystemdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class BankSystemDemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BankSystemDemoApplication.class, args);
        List<List<Integer>> table = new ArrayList<>();

// populate the array one nested element at a time
//        for (int i = 0; i < 3; ++i) {
//            List<Integer> row;
//            table.add( row = new ArrayList<Integer>() );
//            for (int j = 0; j < 4; ++j) {
//                row.add( (i * 4) + j + 1);
//            }
//        }
//
//        for (int i = 0; i < table.size(); ++i) {
//            for (int j = 0; j < table.get(i).size(); ++j) {
//                System.out.print( " " + table.get(i).get(j));
//            }
//            System.out.println();
//        }
        AccountCreation accountCreation = new AccountCreation();

        accountCreation.StartScreen();
//        accountCreation.StartScreen();
//        accountCreation.accounts.forEach(System.out::println);


    }

}
