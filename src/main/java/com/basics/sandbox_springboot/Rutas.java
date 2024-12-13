package com.basics.sandbox_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rutas {

    @GetMapping("/")
    String miPrimeraRuta() {
        return "Hola mundo desde Spring Controller";
    }

    @GetMapping("/libro/{id}/editorial/{editorialId}")
    String leerLibro(@PathVariable int id, @PathVariable String editorialId) {
        return "Leyendo el libro id: " + id + ", editorial: " + editorialId;
    }
}
