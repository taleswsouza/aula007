package com.aula.abstrata.livro.cap07.usando;

import com.aula.abstrata.livro.cap07.Automovel;
import com.aula.abstrata.livro.cap07.Aviao;

public class UsaVeiculos {

    public static void main(String[] args) {
//        Veiculo veiculo = new Veiculo(); >>> ERRO DE COMPILAÇÃO
        Automovel automovel = new Automovel();
        automovel.ligar();
        automovel.acelerar();
        System.out.println(automovel.getVelocidade());
        automovel.desligar();

        Aviao aviao = new Aviao();
        aviao.ligar();
        aviao.acelerar();
        System.out.println(aviao.getVelocidade());
        aviao.desligar();
    }

}
