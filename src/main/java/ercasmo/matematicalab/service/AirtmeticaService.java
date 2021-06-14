package ercasmo.matematicalab.service;

import matematicalib.procesador.ProcesadorAritmetica;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;


@Component
public class AirtmeticaService {

    public BigDecimal sumar(BigDecimal uno, BigDecimal dos) {
        return new ProcesadorAritmetica().sumar(uno,dos);
    }

    public BigDecimal restar(BigDecimal uno, BigDecimal dos) {
        return new ProcesadorAritmetica().restar(uno,dos);
    }

    public BigDecimal multiplicar(BigDecimal uno, BigDecimal dos) {
        return new ProcesadorAritmetica().multiplicar(uno,dos);
    }

    public BigDecimal dividir(BigDecimal uno, BigDecimal dos) {
        return new ProcesadorAritmetica().dividir(uno,dos);
    }
}
