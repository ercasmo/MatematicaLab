package ercasmo.matematicalab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aritmetica")
public class AritmeticaController {

    @GetMapping("/suma/{uno}/dos")
    public ResponseEntity suma(@PathVariable double uno, double dos) {
        return new ResponseEntity<>(uno+dos, HttpStatus.OK);
    }

    @GetMapping("/resta/{uno}/dos")
    public ResponseEntity resta(@PathVariable double uno, double dos) {
        return new ResponseEntity<>(uno-dos, HttpStatus.OK);
    }

}
