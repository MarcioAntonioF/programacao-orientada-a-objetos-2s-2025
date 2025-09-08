package sistema_radar;

public class Simulacao{
    
    public static void main(String[] args) {

        Carro porshe = new Carro();
        porshe.ano = 22;
        porshe.modelo = "911";
        porshe.placa = "PAE6518";
        porshe.velocidade = 0;

        Radar radar = new Radar();
        radar.localizacao = "Pistao Sul";
        radar.limiteVelovidade = 60;

        radar.avaliarVelocidade(porshe);

        porshe.acelerar();
        porshe.acelerar();
        porshe.acelerar();
        porshe.acelerar();
        porshe.acelerar();
        porshe.acelerar();
        porshe.acelerar();

        radar.avaliarVelocidade(porshe);
    }

}