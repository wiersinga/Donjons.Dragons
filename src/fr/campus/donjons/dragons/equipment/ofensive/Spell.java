package fr.campus.donjons.dragons.equipment.ofensive;

import java.util.Random;

public class Spell extends OfensiveEquipment {

    public Spell() {

        Random rand = new Random();
        int randSpell = rand.nextInt(2);
        if (randSpell==0){
             setName("Boule de Feu");
             setScore(7);
        } else {
            setName("Eclair");
            setScore(2);
        }
    }



    public  Spell(String name, int score){

        super(name,score);
    }



}
