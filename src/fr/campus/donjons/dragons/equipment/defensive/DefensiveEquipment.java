package fr.campus.donjons.dragons.equipment.defensive;

import fr.campus.donjons.dragons.equipment.items.Item;

public class DefensiveEquipment extends Item {

    public DefensiveEquipment(String name, int score) {

        super(name, score);
    }

    public DefensiveEquipment() {
    }

    @Override
    public String toString() {
        return "DefensiveEquipment{" +
                "name='" + name + '\'' +
                ", defensifScore=" + score +
                '}';
    }
}
