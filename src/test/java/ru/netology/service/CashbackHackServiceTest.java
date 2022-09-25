package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testRemain100() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(100);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain1() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(1);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain999() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(999);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain1000() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain1500() {
        CashbackHackService cash = new CashbackHackService();

        int actual = cash.remain(1500);
        int expected = 500;

        assertEquals(expected, actual);
    }
}