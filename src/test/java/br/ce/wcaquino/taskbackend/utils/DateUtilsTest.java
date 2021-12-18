package br.ce.wcaquino.taskbackend.utils;


import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class DateUtilsTest {

    @Test
    public void deveRetornarTrueParaDatasFuturas(){
        LocalDate date = LocalDate.of(2030, 1, 1);
        assertTrue(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void deveRetornarFalseParaDatasPassadas(){
        LocalDate date = LocalDate.of(2010, 1, 1);
        assertFalse(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void deveRetornarTrueParaDatasAtual(){
        LocalDate date = LocalDate.now();
        assertTrue(DateUtils.isEqualOrFutureDate(date));
    }
}