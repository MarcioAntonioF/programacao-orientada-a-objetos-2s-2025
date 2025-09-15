package sistema_radar;

public class Radar{
    
    public String localizacao;
    public Integer limiteVelovidade;

    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("Placa: "+placa);
        System.out.println("Velovidade observada: "+velocidadeObservada);
        System.out.println("Localizacao: "+this.localizacao);
        System.out.println("Velovidade da Via: "+this.limiteVelovidade);
    }

    public void avaliarVelocidade(Carro carro){
        if(carro.velocidade > this.limiteVelovidade){
            emitirNotificacao(carro.placa, carro.velocidade);
        }

    }

}