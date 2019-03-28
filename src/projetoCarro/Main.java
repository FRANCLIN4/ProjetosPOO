package projetoCarro;

public class Main {
    public static  void  main( String args[]){
        Proprietario proprietario = new Proprietario();
        proprietario. nome= "Paulo";
        proprietario.bairro = "Jurunas";
        proprietario.cep =" 660033";
        proprietario.cidade = "Belém";
        proprietario.cpf = "9382432872";
        proprietario.datadeNascimento ="09/08/2019";
        proprietario.estado="Pará";
        proprietario.rg="342233";
        proprietario.complemento=" casa";


        Carro carro = new Carro();
        carro.nPortas =5;
        carro.nMarchas =5;
        carro.marchaAtual= 1;
        carro.proprietario = proprietario;
        carro.velocidadeAtual = 10 ;

        System.out.println(carro.velocidadeAtual);
        carro.acelera();
        carro.acelera();
        carro.freia();
        System.out.println(carro.velocidadeAtual);

        System.out.println(carro.marchaAtual);
        carro.trocaMacha(3);
        System.out.println();

    }
}
