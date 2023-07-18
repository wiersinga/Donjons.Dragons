package fr.campus.donjons.dragons.equipment.ofensive;

public class OfensiveEquipment {
    //String type;
    String name;
    int attackScore;
    public OfensiveEquipment(String name, int attackScore) {
        this.name =name;
        this.attackScore = attackScore;
        //this.type = type;
    }

    @Override
    public String toString() {
        return "OfensiveEquipment{"+
                "name='" + name + '\'' +
                ", attackScore=" + attackScore +
                '}';
    }
}

