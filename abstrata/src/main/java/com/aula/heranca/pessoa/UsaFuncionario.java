package com.aula.heranca.pessoa;

public class UsaFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Lucas");
        funcionario.setRg("12.234.456-x");
        funcionario.setCartao("RH123");
        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getRg());
        System.out.println(funcionario.getCartao());
    }
}
