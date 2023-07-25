package fr.campus.donjons.dragons.Cases;

import fr.campus.donjons.dragons.interfaces.ICaseGeneral;

public class EmptyCase implements ICaseGeneral {
    //String message = "case vide";
    public EmptyCase(){
        //System.out.println(this.message);
    }

    @Override
    public void action() {

    }

    @Override
    public String toString() {
        return "EmptyCase{}";
    }
}
