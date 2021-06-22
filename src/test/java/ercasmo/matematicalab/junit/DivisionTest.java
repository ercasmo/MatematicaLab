package ercasmo.matematicalab.junit;

import ercasmo.matematicalab.service.AirtmeticaService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

@RunWith(MockitoJUnitRunner.class)
public class DivisionTest {
    @Autowired
    AirtmeticaService airtmeticaService;
    @Test
    public void testDividir() {
        try {
            BigDecimal divisor=new BigDecimal("10.0");
            BigDecimal dividendo=new BigDecimal("10.0");
            Assert.assertFalse(airtmeticaService.dividir(divisor,dividendo).equals(BigDecimal.ONE));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

