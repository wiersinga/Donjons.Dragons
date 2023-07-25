package fr.campus.donjons.dragons.personnage.enemies;

public class Enemy {
    String nameEnemy;
    int attackEnemy;
    int lifeEnemy;

    public Enemy(String nameEnemy, int attackEnemy, int lifeEnemy) {
        this.nameEnemy = nameEnemy;
        this.attackEnemy = attackEnemy;
        this.lifeEnemy =lifeEnemy;

    }

    @Override
    public String toString() {
        return "Enemy{" +
                "nameEnemy='" + nameEnemy + '\'' +
                ", attackEnemy=" + attackEnemy +
                ", lifeEnemy=" + lifeEnemy +
                '}';
    }

}
