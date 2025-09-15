package sistema_iptu;

public class SecretariaFazenda {

    public static void main(String[] args) {
        Municipio brasilia = new Municipio(nome:"Brasilia",
        estado:"DF" , precoM2:29.50);

        Chacara chacara = new Chacara(brasilia, areaM2:3000.0, vagas:6, possuiPocoArtesiano:false);
        
        Apartamento apt = new Apartamento(brasilia, areaM2:63.0, vagas:1, possuiElevador:true);

        System.out.println("Chácara IPTU R$: " + chacara.calcularIPTU());
        System.out.println("Apt IPTU R$: " + apt.calcularIPTU());
    }
}
