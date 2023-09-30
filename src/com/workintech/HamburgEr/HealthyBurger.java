package com.workintech.HamburgEr;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat){
        super("Healty Burger " , meat ,"Kepekli " ,5.67);
    }
    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice =super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            totalPrice += this.healthyExtra1Price;
            System.out.println("Sağlıklı Ekstra 1: " + this.healthyExtra1Name + " - Fiyat: " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            totalPrice += this.healthyExtra2Price;
            System.out.println("Sağlıklı Ekstra 2: " + this.healthyExtra2Name + " - Fiyat: " + this.healthyExtra2Price);
        }

        return totalPrice;
    }
}
