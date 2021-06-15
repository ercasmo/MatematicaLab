package ercasmo.matematicalab.service;

import matematicalib.procesador.ProcesadorAritmetica;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

/**
 * Servicio para realizar las operaciones aritmeticas.
 * Contienas las siguientes funcionalidades
 * <ul>
 * <li>Suma dos Bigdecimal
 * <li>Resta dos Bigdecimal
 * <li>Divide dos Bigdecimal
 * <li>Multiplica dos Bigdecimal
 * </ul>
 * <p>
 * Lorem Ipsum is simply dummy text of the printing and typesetting industry.
 * Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
 * when an unknown printer took a galley of type and scrambled it to make a type specimen book.
 * It has survived not only five centuries, but also the leap into electronic typesetting,
 * remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets
 * containing Lorem Ipsum passages, and more recently with desktop publishing software
 * like Aldus PageMaker including versions of Lorem Ipsum.
 * <p>
 *
 * @author      Ernesto Cascante Mora
 * @version     %I%, %G%
 * @since       1.0
 */
@Component
public class AirtmeticaService {

    /**
     * Metodo que suma dos BigDecimal y retorna el resultado
     * <p>
     * @param uno       Corresponde al primer termino a sumar
     * @param dos       Corresponde al primer termino a sumar
     * @return          El resultado de la suma
     * @since           1.0
     */
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
