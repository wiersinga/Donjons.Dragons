package fr.campus.donjons.dragons.personnage;

import java.util.Scanner;

public class Character {
    String type;
    String name;
    int lifeScore;
    int attackStrength;
    char offensiveEquipment;
    char defensiveEquipment;

//    public Character(String type) {
//        this.type = type;
//    }

    public void characterName() {
        Scanner console1 = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name =console1.nextLine();
        System.out.println("you name is " + name);


        Scanner console2 = new Scanner(System.in);
        System.out.println("Enter your type");
        String type =console2.nextLine();
        System.out.println("you name is " + type);

    }

    @Override
    public String toString() {
        return "Character{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", lifeScore=" + lifeScore +
                ", attackStrength=" + attackStrength +
                ", offensiveEquipment=" + offensiveEquipment +
                ", defensiveEquipment=" + defensiveEquipment +
                '}';
    }


    public  Character(){

    }

    public Character(String name, String type){
        this.name=name;
        this.type=type;
    }




}
