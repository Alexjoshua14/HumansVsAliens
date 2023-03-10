package app.src.main.java.humansvsaliens.components;

import java.util.List;
import java.util.ArrayList;

public class Alien extends Entity {
    List<Power> powers;


    public Alien(String name, int hp, double weight) {
        super(name, hp, weight);
        this.powers = new ArrayList<Power>();
    }
}