package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss =new Boss();
        boss.setDamage(70);
         boss.setHealth(560);
         boss.setSuperHit("magical");
        System.out.println(boss.getDamage() + boss.getHealth() + boss.getSuperHit());
    }

}








