package ru.netology;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerServiceTest {
    CashbackHackerService service = new CashbackHackerService();

    @Test
    public void shouldAdviceHundred() {
        assertEquals(100, service.remain(900));
    }


    @Test
    public void shouldnotAdvice() {
        assertEquals(0, service.remain(1000));
    }
}
