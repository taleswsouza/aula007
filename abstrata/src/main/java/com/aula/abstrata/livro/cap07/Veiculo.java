package com.aula.abstrata.livro.cap07;

public abstract class Veiculo {
    protected int velocidade;
    private boolean status;

    public int getVelocidade() {
        return velocidade;
    }
    
    public void ligar() {
        status = true;
    }
    public void desligar() {
        status = false;
    }
    public void mostrarStatus() {
        System.out.println(status);
    }
    public abstract void acelerar();
}
