package com.company;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public BankAccount() {
        this(57896, 55,"Default","nic@gmail.com",769930045);
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber (int number) {
        this.accountNumber = number;
    }

    public void setBalance (int number) {
        this.balance = number;
    }

    public void setCustomName (String name) {
        this.customerName = name;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNumber (int number) {
        this.phoneNumber = number;
    }

    public int getAccountNumber () {
        return accountNumber;
    }

    public int balance () {
        return balance;
    }

    public String getCustomName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit (int number) {
        System.out.println("Your new balance is " + (number + balance));
    }

    public void withdraw (int number) {
        if (number > balance) {
            System.out.println("Insufficient Funds");
        } else {
            System.out.println("Your new balance is " + (balance - number));
        }
    }
}
