package fr.campus.donjons.dragons.equipment.ofensive;

import fr.campus.donjons.dragons.equipment.items.Item;

public class OfensiveEquipment extends Item {
       //String name;
    //int attackScore;
    public OfensiveEquipment(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "OfensiveEquipment{"+
                "name='" + name + '\'' +
                ", attackScore=" + score +
                '}';
    }
}

