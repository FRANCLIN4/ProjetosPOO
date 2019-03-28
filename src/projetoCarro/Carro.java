package projetoCarro;

public class Carro {
    String modelo, cor , marca ,chassi;
    int ano, nPortas, nMarchas, marchaAtual;
    double velocidadeMaxima, velocidadeAtual, volumeCombustivel;
    boolean tetoSolar , cambioAtomatico;
    Proprietario proprietario;
    void  acelera(){
        velocidadeAtual = velocidadeAtual + 1;
    }
    void  freia(){
        velocidadeAtual = 0;
    }
    void  trocaMacha (int machaDesejada){
        marchaAtual = machaDesejada;
    }
    void reduzMacha(){
        marchaAtual = marchaAtual - 1;
    }



}
