package fr.campus.donjons.dragons.equipment.defensive;

import java.util.Random;

public class Potion extends DefensiveEquipment {
    Potion potion;
    public Potion() {
        Random rand = new Random();
        int randPotion = rand.nextInt(2);
        if (randPotion == 0){
            this.potion= new Potion("Grande potion", 5);
        } else {
            this.potion= new Potion("potion standard",2);
        }
    }
    public Potion(String name ,int score){
        super(name,score);
    }

//    @Override
//    public String toString() {
//        return "Potion{" +
//                "name='" + name + '\'' +
//                ", defensifScore=" + defensifScore +
//                '}';
//    }
}
