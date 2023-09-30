package com.workintech.HamburgEr;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }
    public void addHamburgerAddition1(String name,double price){
        this.addition1Name= name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }
    public double itemizeHamburger() {
        double totalPrice = this.price;
        System.out.println("Burger Adı: " + this.name);
        System.out.println("Et Türü: " + this.meat);
        System.out.println("Ekmek Çeşidi: " + this.breadRollType);


        if (this.addition1Name != null) {
            totalPrice += this.addition1Price;
            System.out.println("Eksta 1 :" + this.addition1Name + " -Fiyatı: " + this.addition1Price);
        }
        if (this.addition2Name != null) {
            totalPrice += this.addition2Price;
            System.out.println("Eksta 2 :" + this.addition2Name + " -Fiyatı: " + this.addition2Price);
        }
        if (this.addition3Name != null) {
            totalPrice += this.addition3Price;
            System.out.println("Eksta 3 :" + this.addition3Name + " -Fiyatı: " + this.addition3Price);
        }
        if (this.addition4Name != null) {
            totalPrice += this.addition3Price;
            System.out.println("Eksta 4 :" + this.addition4Name + " -Fiyatı: " + this.addition4Price);
        }
        System.out.println("Toplam Fiyat: " + totalPrice);
        return totalPrice;
    }

}
