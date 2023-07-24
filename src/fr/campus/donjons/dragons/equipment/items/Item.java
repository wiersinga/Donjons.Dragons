package fr.campus.donjons.dragons.equipment.items;

public class Item{
    protected String name;
    protected int score;
    public Item(String name, int score){
        this.name =name;
        this.score = score;
    }
    public Item(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
