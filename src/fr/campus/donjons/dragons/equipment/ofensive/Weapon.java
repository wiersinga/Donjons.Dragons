package fr.campus.donjons.dragons.equipment.ofensive;

import java.util.Random;

public class Weapon extends OfensiveEquipment {
   Weapon weapon;
    public Weapon() {
        Random rand = new Random();
        int randWeapon = rand.nextInt(2);
        if (randWeapon==0) {
            this.weapon= new Weapon("Massue", 3);
        } else {
           this.weapon= new Weapon("Epée", 5);
        }

    }
    public Weapon(String name, int score){
        super(name, score);
    }



}
