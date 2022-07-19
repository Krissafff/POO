package com.cursoandroid.teste;

class Animal {

    int tamanho;
    String cor;
    double peso;

    //Getter e Setter
    void setCor(String cor){
        //Formatacao ou validacao
        this.cor = cor;
    }

    String getCor(){
        return this.cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    void dormir(){
        System.out.println("Dormir como um animal");
    }

    void correr(){
        System.out.println("Correr como um");
    }
}
