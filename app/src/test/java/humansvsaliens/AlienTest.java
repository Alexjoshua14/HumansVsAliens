package app.src.test.java.humansvsaliens;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import app.src.main.java.humansvsaliens.components.Alien;

public class AlienTest {
    String name;
    int hp;
    double weight;
    Alien alien;

    @BeforeEach
    void createAlien() {
        name = "Jill";
        hp = 500;
        weight = 100;
        alien = new Alien(name, hp, weight);
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
}
