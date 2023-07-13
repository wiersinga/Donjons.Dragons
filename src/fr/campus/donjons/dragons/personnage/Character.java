package fr.campus.donjons.dragons.personnage;
import fr.campus.donjons.dragons.equipment.DefensiveEquipment;
import fr.campus.donjons.dragons.equipment.OffensiveEquipment;
import java.util.Scanner;

public class Character {
    private String type;
    private String name;
    private int lifeScore;
    private int attackStrength;
    OffensiveEquipment offensiveEquipment;
    DefensiveEquipment defensiveEquipment;





    public void characterInfos() {
        characterName();
        characterType();
        if (type.equals("warrior")){
            this.lifeScore=10;
            this.attackStrength=10;
            this.offensiveEquipment = new OffensiveEquipment("weapon gold", "weapon",98);
            this.defensiveEquipment = new DefensiveEquipment("shield gold","shield",10);
        } else {
            this.lifeScore = 6;
            this.attackStrength=15;
            this.offensiveEquipment = new OffensiveEquipment("double spell", "spell",150);
            this.defensiveEquipment = new DefensiveEquipment("dangerous potion gold","potion",750);
        }
    }

    public void characterName(){
        Scanner console2 = new Scanner(System.in);
        System.out.println("Enter your name ");
        name =console2.nextLine();
        System.out.println("your name is " + name);
    }
    public void characterType(){
        while (type==null || (!type.equals("warrior") && !type.equals("magician"))){
            System.out.println("warrior or magician ? Enter your type");
            Scanner console1 = new Scanner(System.in);
            type =console1.nextLine();
        }
        System.out.println("your type is " + type);
    }
//    public void characterAttackStrength() {
//        if (type.equals("warrior")) {
//            while (attackStrength < 5 || attackStrength > 10) {
//                System.out.println("Enter an attackStrength between  5 et 10");
//                Scanner console3 = new Scanner(System.in);
//                attackStrength = console3.nextInt();
//            }
//        } else {
//            while (attackStrength < 8 || attackStrength > 15) {
//                System.out.println("Enter an attackStrength between  8 et 15");
//                Scanner console3 = new Scanner(System.in);
//                attackStrength = console3.nextInt();
//            }
//        }
//        System.out.println("your attackStrength is :" + attackStrength);
//    }
//    public void characterLifeScore() {
//        if (type.equals("warrior")) {
//            while (lifeScore < 5 || lifeScore> 10) {
//                System.out.println("Enter an lifeScore between  5 et 10");
//                Scanner console4 = new Scanner(System.in);
//                lifeScore = console4.nextInt();
//            }
//        } else {
//            while (lifeScore < 3 || lifeScore > 6) {
//                System.out.println("Enter an lifeScore between  3 et 6");
//                Scanner console4 = new Scanner(System.in);
//                lifeScore = console4.nextInt();
//            }
//        }
//
//        System.out.println("your lifeScore is :" + lifeScore);
//    }

    public Character(){
        this.type=type;
        this.name=name;
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

    public int getLifeScore() {
        return lifeScore;
    }

    public void setLifeScore(int lifeScore) {
        this.lifeScore = lifeScore;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }

    @Override
    public String toString() {
        return " this is your Character{" +
                "\ntype='" + type + '\'' +
                ", \nname='" + name + '\'' +
                ", \nlifeScore=" + lifeScore +
                ", \nattackStrength=" + attackStrength +
                ", \n" + offensiveEquipment +
                ", \n" + defensiveEquipment +
                '}';
    }
}
