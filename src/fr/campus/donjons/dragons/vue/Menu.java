package fr.campus.donjons.dragons.vue;

import java.util.Scanner;

public class Menu {
    String type;
    private String firstChoice = null;
    public String characterType() {
        while (type == null || (!type.equals("warrior") && !type.equals("magician"))) {
            System.out.println("warrior or magician ? Enter your type");
            Scanner console1 = new Scanner(System.in);
            type = console1.nextLine();
        }
        System.out.println("your type is " + type);
        return type;
    }
        public String characterName(){
        Scanner console2 = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name =console2.nextLine();
        System.out.println("your name is " + name);
            return name;
        }

    public void menu() {
        firstChoice = null;
        while (firstChoice == null || (!firstChoice.equals("1") && !firstChoice.equals("2") && !firstChoice.equals("3") && !firstChoice.equals("4"))) {
            System.out.println("1.create character");
            System.out.println("2.modify character");
            System.out.println("3.start game");
            System.out.println("4.exit game");
            System.out.println("make your choice");
            Scanner console = new Scanner(System.in);
            firstChoice = console.nextLine();
        }

    }
        public String getFirstChoice() {
                return firstChoice;
        }

}

