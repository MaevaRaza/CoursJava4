package com.isep.rpg;

import org.junit.jupiter.api.Test;

public PotionTest {
@Test
    Warrior w = new Warrior(100);
    Potion p = new Potion(20);
    w.Set lifePoints(60);
    w.drink(p);
    assertEquals(80 , w.getlifePoints());
}
