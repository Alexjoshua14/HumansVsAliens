package app.src.test.java.humansvsaliens;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import app.src.main.java.humansvsaliens.beings.Alien;
import app.src.main.java.humansvsaliens.components.Power;

import java.util.List;
import java.util.ArrayList;


public class AlienTest {
    String name;
    int hp;
    double weight;
    List<Power> powers;
    Alien alien;

    @BeforeEach
    void createAlien() {
        name = "a";
        hp = 400;
        weight = 273;
        powers = new ArrayList<Power>();
        powers.add(new Power("Telekinesis", "Spooky action at a distance"));
        powers.add(new Power("Mutation", "Ability to take on an alternate form"));


        alien = new Alien("a", 400, 273);
        for (Power p : powers) alien.addPower(p);
    }

    @Test 
    void alienHasName() {
        assertEquals(name, alien.getName());
    }

    @Test 
    void alienHasHP() {
        assertEquals(hp, alien.getHP());
    }

    @Test
    void alienHasWeight() {
        assertEquals(weight, alien.getWeight());
    }

    @Test
    void alienHasPowers() {
        assertEquals(powers, alien.getPowers());
    }
}
