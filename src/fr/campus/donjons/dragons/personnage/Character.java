package fr.campus.donjons.dragons.personnage;

import fr.campus.donjons.dragons.equipment.defensive.DefensiveEquipment;
import fr.campus.donjons.dragons.equipment.ofensive.OfensiveEquipment;

public class Character {
    // private String type;
    String name;
    private int lifeScore;
    private int attackStrength;
    OfensiveEquipment ofensiveEquipment;
    DefensiveEquipment defensiveEquipment;


    Character(String name, int lifeScore, int attackStrength) {
        this.name = name;
        this.lifeScore = lifeScore;
        this.attackStrength = attackStrength;
    }

    public Character(String name, int lifeScore, int attackStrength, OfensiveEquipment ofensiveEquipment, DefensiveEquipment defensiveEquipment) {
        this.name = name;
        this.lifeScore = lifeScore;
        this.attackStrength = attackStrength;
        this.ofensiveEquipment = ofensiveEquipment;
        this.defensiveEquipment = defensiveEquipment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeScore() {
        return lifeScore;
    }

    public void setLifeScore(int lifeScore) {
        this.lifeScore = lifeScore;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }

    public OfensiveEquipment getOfensiveEquipment() {
        return ofensiveEquipment;
    }

    public void setOfensiveEquipment(OfensiveEquipment ofensiveEquipment) {
        this.ofensiveEquipment = ofensiveEquipment;
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }

}