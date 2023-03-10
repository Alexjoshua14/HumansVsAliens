package app.src.test.java.humansvsaliens;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import app.src.main.java.humansvsaliens.components.Effect;
import app.src.main.java.humansvsaliens.components.Boost;
import app.src.main.java.humansvsaliens.beings.*;


public class EffectTest {
    String effectedAttribute;
    int effectedAmount;
    int recurringFrequency;
    int duration;
    Effect nonRecurringEffect;
    Effect recurringEffect;

    @BeforeEach
    void createEffect() {
        effectedAttribute = "hp";
        effectedAmount = 50;
        recurringFrequency = 3;
        duration = 15;

        nonRecurringEffect = new Effect(effectedAttribute, effectedAmount);

        recurringEffect = new Effect(effectedAttribute, effectedAmount, recurringFrequency, duration);
    }

    @Test
    void nonRecurringCase() {
        assertFalse(nonRecurringEffect.isRecurring());
    }

    @Test
    void recurringCase() {
        assertTrue(recurringEffect.isRecurring());
    }

    @Test
    void recurringSpeicificFields() {
        assertNotNull(recurringEffect.getFrequency());
        assertNotNull(recurringEffect.getDuration());
    }

    @Test
    void recurringHealingBoost() {
        int startHP = 400;
        Human e = new Human("Steve", startHP, 132);
        e.takeDamage(209);
        


        assertEquals(startHP - 209, e.getHP());

        //Begin healing
        Effect effect = new Effect("hp", 40);
        Boost boost = new Boost("Health Regeneration", "Healing");
        boost.addEffect(effect);
        e.addBoost(boost);

        assertEquals((startHP - 209) + 40, e.getHP());
    }


}
