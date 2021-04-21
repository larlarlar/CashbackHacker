package ru.netology;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerServiceTest {
    CashbackHackerService service = new CashbackHackerService();

    @Test
    public void shouldAdviceHundred() {
        assertEquals(service.remain(900),100);
    }


    @Test
    public void shouldnotAdvice() {
        assertEquals(service.remain(1000),0);
    }
}
