package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonus() {
        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(1_000, 0);

            assertEquals(0, bonus);
        }

        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(1_000, 1);

            assertEquals(50, bonus);
        }

        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(1_000, 15_000);

            assertEquals(50, bonus);
        }

        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(1_000, 15_001);

            assertEquals(70, bonus);
        }

        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(1_000, 150_000);

            assertEquals(70, bonus);
        }

        {
            BonusService service = new BonusService();
            int bonus = service.calculateBonus(1_000, 150_001);

            assertEquals(100, bonus);
        }
    }
}