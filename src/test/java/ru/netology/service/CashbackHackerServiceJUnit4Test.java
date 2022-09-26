package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerServiceJUnit4Test {

    @Test
    public void testRemain() {
        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(1000);
        int expected =1000;

        assertEquals(expected,actual);
    }

    @Test
    public void testRemain2() {
        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected,actual);
    }
}
