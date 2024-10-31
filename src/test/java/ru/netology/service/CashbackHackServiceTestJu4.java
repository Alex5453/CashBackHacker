package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CashbackHackServiceTestJu4 {
    @Test
    public void shouldReturn100IfAmountIs900() {
    CashbackHackService service = new CashbackHackService();
    int result = service.remain(900);
    assertEquals(100, result); // Ожидаем, что остаток будет 100
}

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        assertEquals(0, result); // Ожидаем, что остаток будет 0
    }

    @Test
    public void shouldReturn500IfAmountIs500() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(500);
        assertEquals(500, result); // Ожидаем, что остаток будет 500
    }

    @Test
    public void shouldFailIfAmountIs1001() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1001);
        assertEquals(999, result); // Ожидаем, что остаток будет 999, но это тест с ошибкой
    }
}
