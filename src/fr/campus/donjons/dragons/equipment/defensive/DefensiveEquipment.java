package fr.campus.donjons.dragons.equipment.defensive;

import fr.campus.donjons.dragons.equipment.items.Item;

public class DefensiveEquipment extends Item {
   // String name;
   // int defensifScore;

    public DefensiveEquipment(String name, int score) {
        this.name = name;
        this.score = score;
    }



    @Override
    public String toString() {
        return "DefensiveEquipment{" +
                "name='" + name + '\'' +
                ", defensifScore=" + score +
                '}';
    }
}
