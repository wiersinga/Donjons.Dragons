package fr.campus.donjons.dragons.vue;
import fr.campus.donjons.dragons.personnage.Character;
import java.util.Scanner;

public class Menu {
    public static void exitGame(){
        return;
    }
    static String firstChoice;

    public static void showPlayer(Character player){
        System.out.println("Player name: "+player.getName());
        System.out.println("Type: "+player.getType());
        System.out.println("Life: "+player.getLifeScore()+" points");
        System.out.println("Force: "+player.getAttackStrength());
        System.out.println("Offensive equipment:");
        System.out.println("    Type: "+player.getOffensiveEquipment().getType());
        System.out.println("    Name: "+player.getOffensiveEquipment().getName());
        System.out.println("    Offensive points: "+player.getOffensiveEquipment().getAttackScore());
        System.out.println("Deffensive equipment:");
        System.out.println("    Type: "+player.getDefensiveEquipment().getType());
        System.out.println("    Name: "+player.getDefensiveEquipment().getName());
        System.out.println("    Deffensive points: "+player.getDefensiveEquipment().getDefensifScore());
    }


    public static void menu(){
        Character characterPlayer= new Character("","");
        characterPlayer.characterInfos();

        firstChoice= null;
            while (firstChoice==null || (!firstChoice.equals("show") && !firstChoice.equals("edit") && !firstChoice.equals("exit"))){
                System.out.println("continue, edit or exit ? ");
                Scanner console1 = new Scanner(System.in);
                firstChoice = console1.nextLine();
            }
            if (firstChoice.equals("continue")){
                showPlayer(characterPlayer);
            } else if (firstChoice.equals("edit")) {
                menu();
            } else {
               exitGame();
               System.out.println("see you next time");
            }

    }



}
