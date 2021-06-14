package ercasmo.matematicalab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.MathContext;

@RestController
@RequestMapping("/aritmetica")
public class AritmeticaController {

    @GetMapping("/suma/{uno}/{dos}")
    public ResponseEntity suma(@PathVariable BigDecimal uno,@PathVariable BigDecimal dos) {
        BigDecimal resultado=uno.add(dos, MathContext.DECIMAL128);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @GetMapping("/resta/{uno}/{dos}")
    public ResponseEntity resta(@PathVariable BigDecimal uno, @PathVariable BigDecimal dos) {
        BigDecimal resultado=uno.subtract(dos, MathContext.DECIMAL128);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @GetMapping("/multiplicacion/{uno}/{dos}")
    public ResponseEntity multiplicacion(@PathVariable BigDecimal uno, @PathVariable BigDecimal dos) {
        BigDecimal resultado=uno.multiply(dos, MathContext.DECIMAL128);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @GetMapping("/division/{uno}/{dos}")
    public ResponseEntity division(@PathVariable BigDecimal uno, @PathVariable BigDecimal dos) {
        BigDecimal resultado=uno.divide(dos, MathContext.DECIMAL128);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @GetMapping("/divisionSimple/{uno}/{dos}")
    public ResponseEntity division(@PathVariable double uno, @PathVariable double dos) {
        return new ResponseEntity<>(uno/dos, HttpStatus.OK);
    }
}
