package com.desafio03.apidesafio03.Service;


import com.desafio03.apidesafio03.Model.desafio03Model;
import com.desafio03.apidesafio03.Model.desafio03Model02;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class desafio03Service {

    public static desafio03Model contaLetras(String frase) {

        desafio03Model model = new desafio03Model();
        desafio03Model02 model02 = new desafio03Model02();

       Integer letras = 1;
       Integer espacos = 1;
       Integer outros = 1;


        String[] fraseEntrada = frase.split("_");
        List<String> fraseCertinha = Arrays.asList(fraseEntrada);
        model.setRetornoFrase(fraseCertinha);


        for (int i = 0; i < frase.length(); i++) {
            if (model02.isLetter(frase.charAt(i)))
                model.setLetrasRetorno(Collections.singletonList(letras++));
            else if (model02.isSpace(frase.charAt(i)))
                model.setEspacosRetorno(Collections.singletonList(espacos++));
            else
                model.setOutrosRetorno(Collections.singletonList(outros++));
        }

        return model;

    }
}
