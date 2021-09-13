package com.desafio03.apidesafio03.Controller;


import com.desafio03.apidesafio03.Model.desafio03Model;
import com.desafio03.apidesafio03.Service.desafio03Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/desafio03")
public class desafio03Controller {


    @GetMapping(value = "/frase")
    public desafio03Model desafioContarLetras(@RequestParam String frase) {
        return desafio03Service.contaLetras(frase);
    }
}
