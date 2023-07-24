package fr.campus.donjons.dragons.jouer;

import fr.campus.donjons.dragons.Cases.EmptyCase;
import fr.campus.donjons.dragons.Cases.EnemyCase;
import fr.campus.donjons.dragons.Cases.ItemCase;
import fr.campus.donjons.dragons.interfaces.ICaseGeneral;
import fr.campus.donjons.dragons.personnage.Character;
import fr.campus.donjons.dragons.personnage.Magician;
import fr.campus.donjons.dragons.personnage.Warrior;
import fr.campus.donjons.dragons.vue.Menu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public boolean isEmpty() {
        return false;
    }

    public int[] board = new int[64];
    Character playerOne;

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
    public int letsDice() {
        Random rand = new Random();
        int maxRandom = 6;
        int number = rand.nextInt(maxRandom) + 1;
        return number;
    }
public void fightGame(){

}
public void getSurprise(){
if (playerOne.equals("warrior") && ){

}

}
    public ArrayList<ICaseGeneral> fillBoard() {
        ArrayList<ICaseGeneral> gBoard = new ArrayList<>();
        Random x = new Random();
        for (int i = 0; i < 64; i++) {
            int caseRandom = x.nextInt(3);
            if (caseRandom == 0) {
                gBoard.add(new EmptyCase());
            } else if (caseRandom == 1) {
                gBoard.add(new EnemyCase());
            } else {
                gBoard.add(new ItemCase());
            }
        }
        return gBoard;
    }

    public void startGame() {
       ArrayList gameBoard = fillBoard();
        System.out.println(gameBoard);
        Random rand = new Random();
        int maxRandom = 6;
        int playerPosition = board[0] + 1;
        while (board.length >= playerPosition) {
           for (int i=0; i<gameBoard.size(); i++){
               if (gameBoard.get(i) instanceof EmptyCase) {
                   int dice = letsDice();
                   i+=dice;
               } else if (gameBoard.get(i) instanceof EnemyCase) {
                   fightGame();
               } else {
                   getSurprise();
               }


           }
            //int dice = rand.nextInt(maxRandom) + 1;
//            System.out.println("your dice is " + dice);
//            playerPosition += dice;
//            System.out.println("your position is " + playerPosition);
//        }
//        System.out.println("you arrived ! Bravo");
    }
    }

    public void getThirdChoice() {
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



