package fr.campus.donjons.dragons.personnage.enemies;

public class Goblin extends Enemy{
    public Goblin() {

        super("goblin", 1, 6);
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "nameEnemy='" + nameEnemy + '\'' +
                ", attackEnemy=" + attackEnemy +
                ", lifeEnemy=" + lifeEnemy +
                '}';
    }
}
