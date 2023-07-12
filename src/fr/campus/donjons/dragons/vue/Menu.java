package fr.campus.donjons.dragons.vue;

import java.util.Scanner;

public class Menu {
    private String firstChoice=null;
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







//    public static void moveOn(){
//
//    }


//        firstChoice = null;
//        while (firstChoice == null || (!firstChoice.equals("yes") && !firstChoice.equals("no"))) {
//            System.out.println("do you want to start the game ? ");
//            Scanner console1 = new Scanner(System.in);
//            firstChoice = console1.nextLine();
//        }
//        if (firstChoice.equals("yes")) {
//            Character characterPlayer = new Character("", "");
//            characterPlayer.characterInfos();
////            characterPlayer.toString();
//
//            secondChoice = null;
//            while (secondChoice == null || (!secondChoice.equals("continue") && !secondChoice.equals("edit") && !secondChoice.equals("exit"))){
//                System.out.println("continue, edit or exit ? ");
//                Scanner console1 = new Scanner(System.in);
//                secondChoice = console1.nextLine();
//            }
//            if (secondChoice.equals("continue")) {
//                System.out.println(characterPlayer);
//                positionPlayer = 0;
//                //System.out.println("you dice value is : "+ generateRandom());
//            } else if (secondChoice.equals("edit")) {
//                menu();
//            } else {
//                exitGame();
//                System.out.println("see you next time");
//            }
//        } else {
//            exitGame();
//        }
//    }

//    public static void showPlayer(Character player) {
//        System.out.println("Player name: " + player.getName());
//        System.out.println("Type: " + player.getType());
//        System.out.println("Life: " + player.getLifeScore() + " points");
//        System.out.println("Force: " + player.getAttackStrength());
//        System.out.println("Ofensive equipment:");
//        System.out.println("    Type: " + player.getOffensiveEquipment().getType());
//        System.out.println("    Name: " + player.getOffensiveEquipment().getName());
//        System.out.println("    Offensive points: " + player.getOffensiveEquipment().getAttackScore());
//        System.out.println("Defensive equipment:");
//        System.out.println("    Type: " + player.getDefensiveEquipment().getType());
//        System.out.println("    Name: " + player.getDefensiveEquipment().getName());
//        System.out.println("    Defensive points: " + player.getDefensiveEquipment().getDefensifScore());
//    }