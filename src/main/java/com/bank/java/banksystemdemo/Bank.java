package com.bank.java.banksystemdemo;

public interface Bank {
    long getBalance();
    void withdraw(long amount);
    void deposit(long amount);
    void showAccount();
    boolean search(String accountNumber);
}
