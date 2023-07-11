package fr.campus.donjons.dragons.equipment;

public class DefensiveEquipment {
    String name;
    String type;
    int defensifScore;

    public DefensiveEquipment(String name ,String type, int defensifScore) {
        this.name = name;
        this.type = type;
        this.defensifScore = defensifScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDefensifScore() {
        return defensifScore;
    }

    public void setDefensifScore(int defensifScore) {
        this.defensifScore = defensifScore;
    }

    @Override
    public String toString() {
        return "DefensiveEquipment{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", defensifScore=" + defensifScore +
                '}';
    }
}
