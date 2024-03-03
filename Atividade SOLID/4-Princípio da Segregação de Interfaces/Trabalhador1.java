public interface Trabalhador1 {
    void trabalhar();
}

public interface Comedor {
    void comer();
}

/**
 * Dormidor
 */
public interface Dormidor {
    void dormir();

}

/**
 * InnerTrabalhador1
 */
public class Empregado implements Trabalhador1, Comedor, Dormidor {
    @Override
    public void trabalhar() {

    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }
}
// Agora temos interface mais específcicas, evitando a implementação
// desnecesária de métodos