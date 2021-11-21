package com.company;

public class Main {
    int heals;
    int damage;
    String superPower;

    public static void main(String[] args) {
        Boss puma = new Boss();
        puma.setBossHealth(700);
        puma.setBossDamage(70);
        puma.setSuperPower("evasion");
        System.out.println(" Здаровие боса" + puma.getBossHealth() + "," +
                " урон боса" + puma.getBossDamage() +
                " Зашита боса" + puma.getSuperPower());
    }
}

