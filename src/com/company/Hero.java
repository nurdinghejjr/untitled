package com.company;

public class Hero {
  private int health;
  private int damage;
  private String superBanana;

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public String getSuperBanana() {
    return superBanana;
  }

  public void setSuperBanana(String superBanana) {
    this.superBanana = superBanana;
  }

  public Hero(int health, int damage) {
    this.health = health;
    this.damage = damage;
  }

  public Hero(int health, int damage, String superBanana) {
    this.health = health;
    this.damage = damage;
    this.superBanana = superBanana;
  }
}
