package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void notRecommendBuying(){
        CashbackHackService service=new CashbackHackService();
        int amount=1000;
        int actual=service.remain(amount);
        int expected=0;
        assertEquals(expected,actual);
    }

    @org.junit.Test
    public void advisesToBuy(){
        CashbackHackService service=new CashbackHackService();
        int amount=1200;
        int actual=service.remain(amount);
        int expected=800;
        assertEquals(expected,actual);
    }

}