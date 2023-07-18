package fr.campus.donjons.dragons.equipment.defensive;

public class DefensiveEquipment {
    String name;
   // String type;
    int defensifScore;

    public DefensiveEquipment(String name, int defensifScore) {
        this.name = name;
       // this.type = type;
        this.defensifScore = defensifScore;
    }



    @Override
    public String toString() {
        return "DefensiveEquipment{" +
                "name='" + name + '\'' +
                ", defensifScore=" + defensifScore +
                '}';
    }
}
