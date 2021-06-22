package ercasmo.matematicalab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aritmeticasimple")
public class AritmeticaSimpleController {

    @GetMapping("/div")
    public Double div(@RequestParam("uno") Double a, @RequestParam("dos") Double b) {
        return a / b;
    }

    @GetMapping("/mul")
    public Double mul(@RequestParam("uno") Double a, @RequestParam("dos") Double b) {
        return a * b;
    }

    @GetMapping("/subtract")
    public Double subtract(@RequestParam("uno") Double a, @RequestParam("dos") Double b) {
        return a - b;
    }

    @GetMapping("/add")
    public Double add(@RequestParam("uno") Double a, @RequestParam("dos") Double b) {
        return a + b;
    }

}
