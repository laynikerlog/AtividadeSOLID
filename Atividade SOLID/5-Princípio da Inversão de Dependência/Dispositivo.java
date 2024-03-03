package Atividade SOLID.5-Princípio da Inversão de Dependência;

interface Dispositivo {
    void ligar();

    void desligar();
}

public class Lampada implements Dispositivo {
    @Override
    public void ligar() {
        // metodos de ligar a lampada
    }

    @Override
    public void desligar() {
        // logica de desligar a lampada
    }

}

/**
 * InnerDispositivo
 */
public class Interruptor {
    private Dispositivo dispositivo;

    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
        // utilizando uma abstração (interface) em vez de uma implementação concreta
    }

    public void acionar() {
        if (dispositivo.estaligado()) {
            dispositivo.desligar();
        } else {
            dispositivo.ligar();
        }
    }

}