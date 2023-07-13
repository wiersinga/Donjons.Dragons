package fr.campus.donjons.dragons.jouer;

import fr.campus.donjons.dragons.personnage.Character;
import fr.campus.donjons.dragons.vue.Menu;
import java.util.Random;
import java.util.Scanner;

public class Game {
   Character playerOne;
    public void createPlayer() {
        this.playerOne = new Character();
        playerOne.characterInfos();
        System.out.println(playerOne);
    }
    public static void exitGame() {
    }

    public void game() {
        Menu showMenu = new Menu();
        showMenu.menu();
        System.out.println(showMenu);
        String secondChoice = showMenu.getFirstChoice();

        if (secondChoice==null || secondChoice.equals("1") || secondChoice.equals("2")) {
            createPlayer();
            game();
        } else if (secondChoice.equals("3")) {
            if (playerOne != null){
                Random rand = new Random();
                int maxRandom = 6;
                int playerPosition=1;
                int board = 64;
                while (board>playerPosition){
                    int dice = rand.nextInt(maxRandom)+1;
                    System.out.println("your dice is "+dice);
                    playerPosition+=dice;
                    System.out.println("your position is "+playerPosition);
                    // board-=dice;
                }
                System.out.println("you arrived ! Bravo");
                String thirdChoice=null;
                while(thirdChoice==null || (!thirdChoice.equals("2") && !thirdChoice.equals("1"))){
                    System.out.println("1.restart or 2.exit the game ?");
                    Scanner console = new Scanner(System.in);
                    thirdChoice = console.nextLine();
                }
                if (thirdChoice.equals("1")){
                    System.out.println("welcome again");
                    game();
                } else {
                    exitGame();
                    System.out.println("see you next time");
                    game();
                }
            } else {
                System.out.println("create first a character ! ");
                game();
            }

        } else {
            exitGame();
            System.out.println("see you next time");
            game();
        }
    }
    }



