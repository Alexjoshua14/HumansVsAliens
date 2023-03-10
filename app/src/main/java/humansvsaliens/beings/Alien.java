package app.src.main.java.humansvsaliens.beings;

import app.src.main.java.humansvsaliens.components.*;

import java.util.List;
import java.util.ArrayList;

public class Alien extends Entity {
    List<Power> powers;

    public Alien(String name, int hp, double weight) {
        super(name, hp, weight);
        this.powers = new ArrayList<Power>();
    }

    public void addPower(Power p) {
        powers.add(p);
    }

    public List<Power> getPowers() {
        return this.powers;
    }

    @Override
    public String toString() {
        String str = this.name + " (Alien)\n";
        str += "HP: \n  " + this.hp + "\n";
        str += "Weight: \n  " + this.weight + "lbs\n";
        str += "Powers: \n";
        for (Power p : powers) {
            str += "  " + p + "\n";
        }

        return str;
    }
}