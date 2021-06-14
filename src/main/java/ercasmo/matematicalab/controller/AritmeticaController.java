package ercasmo.matematicalab.controller;

import ercasmo.matematicalab.service.AirtmeticaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.xml.ws.http.HTTPBinding;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/aritmetica")
public class AritmeticaController {
    @Autowired
    AirtmeticaService airtmeticaService;

    @GetMapping("/suma/{uno}/{dos}")
    public ResponseEntity suma(@PathVariable BigDecimal uno,@PathVariable BigDecimal dos) {
        BigDecimal resultado=airtmeticaService.sumar(uno,dos);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @GetMapping("/resta/{uno}/{dos}")
    public ResponseEntity resta(@PathVariable BigDecimal uno, @PathVariable BigDecimal dos) {
        BigDecimal resultado=airtmeticaService.restar(uno,dos);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @GetMapping("/multiplicacion/{uno}/{dos}")
    public ResponseEntity multiplicacion(@PathVariable BigDecimal uno, @PathVariable BigDecimal dos) {
        BigDecimal resultado=airtmeticaService.multiplicar(uno,dos);
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @GetMapping("/division")
    public ResponseEntity division(@RequestParam("divisor")   BigDecimal divisor, @RequestParam("dividendo") BigDecimal dividendo) {
        if(dividendo.compareTo(BigDecimal.ZERO)!=0) {
            BigDecimal resultado=airtmeticaService.dividir(divisor,dividendo);
            return new ResponseEntity<>(resultado, HttpStatus.OK);
        }else{
            Map<String,String> errores=new LinkedHashMap<>();
            errores.put("code",String.valueOf(HttpStatus.BAD_REQUEST));
            errores.put("message","Dividendo no puede ser cero");
            return new ResponseEntity<>(errores, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/divisionSimple/{uno}/{dos}")
    public ResponseEntity division(@PathVariable double uno, @PathVariable double dos) {
        return new ResponseEntity<>(uno/dos, HttpStatus.OK);
    }
}
