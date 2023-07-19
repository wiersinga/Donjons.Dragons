package fr.campus.donjons.dragons.personnage;

import fr.campus.donjons.dragons.equipment.defensive.Potion;
import fr.campus.donjons.dragons.equipment.ofensive.Spell;

public class Magician extends Character{
    public Magician(String name){
        super(name,
                6,
                15, new Spell("power spell", 15), new Potion("potion",20));
    }

    @Override
    public String toString() {
        return "Magician{" +
                "\n name='" + name + '\'' +
                ", \n " + ofensiveEquipment +
                ", \n" + defensiveEquipment +
                '}';
    }
}
