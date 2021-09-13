package com.desafio03.apidesafio03.Model;

public class desafio03Model02 {

    public boolean isLetter(char ch) {
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            return true;
        else
            return false;
    }

    public boolean isSpace(char ch) {
        if(ch == '_')
            return true;
        else
            return false;
    }
}
