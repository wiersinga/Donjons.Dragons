package fr.campus.donjons.dragons.personnage.enemies;

public class Dragon extends Enemy{
    public Dragon() {
        super("dragon",4,15);
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "nameEnemy='" + nameEnemy + '\'' +
                ", attackEnemy=" + attackEnemy +
                ", lifeEnemy=" + lifeEnemy +
                '}';
    }
}
