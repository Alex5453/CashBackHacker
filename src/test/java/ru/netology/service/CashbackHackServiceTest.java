package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        assertEquals(100, result);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        assertEquals(0, result);
    }

    @Test
    public void shouldReturn500IfAmountIs500() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(500);
        assertEquals(500, result);
    }
}
