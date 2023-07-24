package fr.campus.donjons.dragons.equipment.ofensive;

import fr.campus.donjons.dragons.equipment.items.Item;

public class OfensiveEquipment extends Item {

    public OfensiveEquipment(String name, int score) {
        super(name, score);

    }
    public OfensiveEquipment() {
    }

    @Override
    public String toString() {
        return "OfensiveEquipment{"+
                "name='" + name + '\'' +
                ", attackScore=" + score +
                '}';
    }

}

