package app.src.test.java.humansvsaliens;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import app.src.main.java.humansvsaliens.components.Human;

public class HumanTest {
    String name;
    int hp;
    double weight;
    Human human;

    @BeforeEach
    void createHuman() {
        name = "Jill";
        hp = 500;
        weight = 100;
        human = new Human(name, hp, weight);
    }

    @Test 
    void humanHasName() {
        assertEquals(name, human.getName());
    }

    @Test 
    void humanHasHP() {
        assertEquals(hp, human.getHP());
    }

    @Test
    void humanHasWeight() {
        assertEquals(weight, human.getWeight());
    }
}
