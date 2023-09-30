package com.workintech.HamburgEr;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(){
        super("Deluxe Burger " ,"Bacon and Sosis " ,"Beyaz ",19.10);
        super.addHamburgerAddition1("Cips " , 2.75);
        super.addHamburgerAddition2("Büyük Boy İçecek " , 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger'e ekstra malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger'e ekstra malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger'e ekstra malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger'e ekstra malzeme eklenemez.");
    }
}
