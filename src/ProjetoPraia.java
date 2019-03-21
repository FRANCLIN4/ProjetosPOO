public class ProjetoPraia {
    public static void main (String args []){
        CRIANÇA c1= new CRIANÇA ();
        c1.altura=1.6;
        c1.corCabelo = "loiro";
        c1.corPele="Branca";
        c1.idade=10;
        c1.brincar();
        c1.correr(100);
        String sorriso = c1.sorrir();
        System.out.println(sorriso);


        CRIANÇA c5= new CRIANÇA();
        c1.altura = 4.9;
        c1.corCabelo= "morena";
        c1.corPele = "azul";


    }
}
