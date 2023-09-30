package com.workintech.HamburgEr;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Normal" ,"Wrap", 3.56);

        hamburger.addHamburgerAddition1("Tomato", 0.27);

        hamburger.addHamburgerAddition2("Lettuce", 0.75);

        hamburger.addHamburgerAddition3("Cheese", 1.13);

        hamburger.itemizeHamburger();

        System.out.println("--------------------------------------");

        HealthyBurger healthyBurger = new HealthyBurger("Roll");

        healthyBurger.addHamburgerAddition1("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        healthyBurger.itemizeHamburger();

        System.out.println("------------------------------------");

        DeluxeBurger db = new DeluxeBurger();

        db.addHamburgerAddition3("Should not do this", 50.53);

        db.itemizeHamburger();
    }
}