package fr.campus.donjons.dragons;
import fr.campus.donjons.dragons.personnage.Character;
public class Main {
    public static void main(String[] argv){
        Character characterPlayer = new Character("warrior","guerrier");
        System.out.println(characterPlayer);
        characterPlayer.characterName();

    }
}
