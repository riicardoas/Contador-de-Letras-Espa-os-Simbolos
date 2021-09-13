package com.desafio03.apidesafio03.Model;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class desafio03Model {

    List<String> retornoFrase = new ArrayList<>();
    List<Integer> espacosRetorno = new ArrayList<>();
    List<Integer> letrasRetorno = new ArrayList<>();
    List<Integer> outrosRetorno = new ArrayList<>();

}
