package br.senac.sp.guiarestaurante.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senac.sp.guiarestaurante.model.TipoRestaurante;

@RestController
public class TipoRestauranteController {
    @GetMapping("/tipos")
    public TipoRestaurante getRestaurante() {

        TipoRestaurante tipoRestaurante = new TipoRestaurante();
        tipoRestaurante.setId(1L);
        tipoRestaurante.setNome("Churrascaria");
        tipoRestaurante.setDescricao("Churrascaria com carnes nobres e buffet variado.");

        return tipoRestaurante;
    }


}
