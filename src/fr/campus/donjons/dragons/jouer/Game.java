package fr.campus.donjons.dragons.jouer;

import fr.campus.donjons.dragons.interfaces.ICaseGeneral;
import fr.campus.donjons.dragons.personnage.Character;
import fr.campus.donjons.dragons.personnage.Magician;
import fr.campus.donjons.dragons.personnage.Warrior;
import fr.campus.donjons.dragons.personnage.enemies.Enemy;
import fr.campus.donjons.dragons.vue.Menu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
   public int[] board = new int[64];
    Character playerOne;
    //private ArrayList<Object> array;

    public void createPlayer() {
        Menu characterMenu = new Menu();
        String type = characterMenu.characterType();
        String name = characterMenu.characterName();
        if (type.equals("warrior")) {
            this.playerOne = new Warrior(name);
            System.out.println(playerOne);
        } else {
            this.playerOne = new Magician(name);
            System.out.println(playerOne);
        }
    }

    public static void exitGame() {

    }

    public void getChoiceMenu() {
        Menu showMenu = new Menu();
        showMenu.menu();
        System.out.println(showMenu);
        String secondChoice = showMenu.getFirstChoice();
        if (secondChoice == null || secondChoice.equals("1")) {
            createPlayer();
            getChoiceMenu();
        } else if (secondChoice.equals("2")) {
            if (playerOne != null) {
                createPlayer();
                getChoiceMenu();
            } else {
                System.out.println("there's no character to modify it");
                getChoiceMenu();
            }
        } else if (secondChoice.equals("3")) {
            dicePlay();
        } else {
            exitGame();
            System.out.println("see you Sooooooooon");
            getChoiceMenu();
        }
    }
    public void letsDice(){

    }
    public void fillBoard(){
        ArrayList<ICaseGeneral> board = new ArrayList<>();
        Random x = new Random();
       // int randIndex = x.nextInt(62)+2;
        for (int i = 0; i < board.size(); i++){
            board.add( x.nextInt(20)+2, (ICaseGeneral) new Enemy("goblin",2,9));
        }
    }
    public void startGame(){
        Random rand = new Random();
        int maxRandom = 6;
        int playerPosition = board[0] + 1;
        while (board.length >= playerPosition) {
            int dice = rand.nextInt(maxRandom) + 1;
            System.out.println("your dice is " + dice);
            playerPosition += dice;
            System.out.println("your position is " + playerPosition);

        }
        System.out.println("you arrived ! Bravo");
    }
    public void getThirdChoice(){
        String thirdChoice = null;
        while (thirdChoice == null || (!thirdChoice.equals("2") && !thirdChoice.equals("1"))) {
            System.out.println("1.restart or 2.exit the Game ?");
            Scanner console = new Scanner(System.in);
            thirdChoice = console.nextLine();
        }
        if (thirdChoice.equals("1")) {
            System.out.println("welcome again");
            getChoiceMenu();
        } else {
            exitGame();
            System.out.println("see you next time");
            getChoiceMenu();
        }
    }
    public void dicePlay() {
        if (playerOne != null) {
            startGame();
            getThirdChoice();
//            if (playerPosition>board.length){
//                throw new CharacterexceptBoardException("message test dice ");
//            }
        } else {
            System.out.println("create first a character ! ");
            getChoiceMenu();
        }
    }
}



