package fr.campus.donjons.dragons.personnage.enemies;

public class Witcher extends Enemy{

    public Witcher() {
        super("witcher", 2, 9);
    }

    @Override
    public String toString() {
        return "Witcher{" +
                "nameEnemy='" + nameEnemy + '\'' +
                ", attackEnemy=" + attackEnemy +
                ", lifeEnemy=" + lifeEnemy +
                '}';
    }
}
