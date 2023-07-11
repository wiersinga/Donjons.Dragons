package fr.campus.donjons.dragons;
import fr.campus.donjons.dragons.vue.Menu;
public class Main {
    public static void main(String[] argv){
      Menu showMenu = new Menu();
      showMenu.menu();
      System.out.println(showMenu);
    }
}
