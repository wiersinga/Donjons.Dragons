package fr.campus.donjons.dragons.personnage;

import fr.campus.donjons.dragons.equipment.defensive.Shield;
import fr.campus.donjons.dragons.equipment.ofensive.Weapon;

public class Warrior extends Character{

    public Warrior(String name) {
        super(name, 10, 10, new Weapon(), new Shield());

    }

    @Override
    public String toString() {
        return "You are a Warrior{" +
                "\n  name='" + name + '\'' +
                ",\n  " + ofensiveEquipment +
                ",\n  " + defensiveEquipment +
                '}';
    }
}
