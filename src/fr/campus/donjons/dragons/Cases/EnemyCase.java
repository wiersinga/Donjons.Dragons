package fr.campus.donjons.dragons.Cases;

import fr.campus.donjons.dragons.interfaces.ICaseGeneral;
import fr.campus.donjons.dragons.personnage.enemies.Dragon;
import fr.campus.donjons.dragons.personnage.enemies.Enemy;
import fr.campus.donjons.dragons.personnage.enemies.Goblin;
import fr.campus.donjons.dragons.personnage.enemies.Witcher;

import java.util.Random;

public class EnemyCase implements ICaseGeneral {
    Enemy enemy;
    public EnemyCase() {
        Random rand = new Random();
        int randEnemy= rand.nextInt(3);
        if (randEnemy == 0){
            this.enemy= new Dragon();
        } else if (randEnemy== 1){
            this.enemy = new Goblin();
        } else {
            this.enemy = new Witcher();
        }
    }


    @Override
    public void action() {

    }




}
