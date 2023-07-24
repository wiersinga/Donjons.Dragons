package fr.campus.donjons.dragons.Cases;

import fr.campus.donjons.dragons.equipment.defensive.Potion;
import fr.campus.donjons.dragons.equipment.defensive.Shield;
import fr.campus.donjons.dragons.equipment.items.Item;
import fr.campus.donjons.dragons.equipment.ofensive.Spell;
import fr.campus.donjons.dragons.equipment.ofensive.Weapon;
import fr.campus.donjons.dragons.interfaces.ICaseGeneral;

import java.util.Random;

public class ItemCase implements ICaseGeneral {
     Item item;
    public ItemCase() {
        Random rand = new Random();
        int itemRandom = rand.nextInt(4);
        if (itemRandom == 0){
            this.item = new Potion();
        } else if (itemRandom == 1){
            this.item= new Shield();
        } else if (itemRandom == 2){
            this.item= new Spell();
        } else {
            this.item= new Weapon();
        }
    }

    @Override
    public void action() {


    }


}
