package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackerServiceTest {

    @Test
    public void testRemain() {
        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(1000);
        int expected =1000;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() {
        CashbackHackerService service = new CashbackHackerService();
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }
}
