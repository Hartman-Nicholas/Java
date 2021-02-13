package com.company;

public class Main {

    public static void main(String[] args) {
	VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("bob",25000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("tim", 50000, "tim@gmail.com");
        System.out.println(person3.getName());


    }
}
