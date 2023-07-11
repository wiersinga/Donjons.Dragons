package fr.campus.donjons.dragons.equipment;

public class OffensiveEquipment {
    String type;
    String name;
    int attackScore;
    public OffensiveEquipment(String name, String type,int attackScore) {
        this.name =name;
        this.attackScore = attackScore;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackScore() {
        return attackScore;
    }

    public void setAttackScore(int attackScore) {
        this.attackScore = attackScore;
    }

    @Override
    public String toString() {
        return "OffensiveEquipment{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", attackScore=" + attackScore +
                '}';
    }
}

