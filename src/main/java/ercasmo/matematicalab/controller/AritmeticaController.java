package ercasmo.matematicalab.controller;

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

    @GetMapping("/division")
    public ResponseEntity division(@RequestParam("divisor")   BigDecimal divisor, @RequestParam("dividendo") BigDecimal dividendo) {
        if(dividendo.compareTo(BigDecimal.ZERO)!=0) {
            BigDecimal resultado = divisor.divide(dividendo, MathContext.DECIMAL128);
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
