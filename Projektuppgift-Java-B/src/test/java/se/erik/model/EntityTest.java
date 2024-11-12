package se.erik.model;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class EntityTest {


    @Test
    void testBurgPunchRes() {

        Burglar burglar = new Burglar();
        Resident resident = new Resident();
        int result1 = resident.getHealth();
        burglar.punch(resident);
        int result2 = resident.getHealth();

        Assertions.assertTrue(result2 < result1);
    }
    @Test
    void testResPunchBurg(){
        Burglar burglar = new Burglar();
        Resident resident = new Resident();
        int result1 = burglar.getHealth();
        resident.punch(burglar);
        int result2 = burglar.getHealth();

        Assertions.assertTrue(result2 < result1);
    }

    @Test
    void testResIsConsious() {
        Resident resident = new Resident();
        resident.setHealth(0);
        boolean result = resident.isConsious();
        Assertions.assertFalse(result);
    }
    @Test
    void testBurgIsCoinsious(){
        Burglar burglar = new Burglar();
        burglar.setHealth(0);
        boolean result = burglar.isConsious();
        Assertions.assertFalse(result);
    }
}