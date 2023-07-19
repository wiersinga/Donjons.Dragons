package fr.campus.donjons.dragons;

import fr.campus.donjons.dragons.jouer.Game;
public class Main {
    public static void main(String[] argv){
        Game showGame = new Game();
        showGame.getChoiceMenu();
        System.out.println(showGame);
        }
}
