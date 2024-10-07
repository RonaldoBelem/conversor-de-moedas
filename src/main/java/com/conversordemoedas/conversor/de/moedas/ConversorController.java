package com.conversordemoedas.conversor.de.moedas;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;

@Controller
public class ConversorController {
    @Autowired
    private ConversorService conversorService;

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @PostMapping("/converter")
    public String converter(@RequestParam String moedaOrigem,
                            @RequestParam String moedaDestino,
                            @RequestParam double valor,
                            @NotNull Model model) {
        double resultado = conversorService.converter(moedaOrigem, moedaDestino, valor);
        model.addAttribute("resultado", resultado);


        // Formatação para 2 casas decimais
        DecimalFormat df = new DecimalFormat("#.##");
        String resultadoFormatado = df.format(resultado);

        model.addAttribute("resultado", resultadoFormatado);
        return "resultado"; // Nome da template Thymeleaf

    }
}
