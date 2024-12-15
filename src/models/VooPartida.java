// Subclasse VooPartida
package models;

public class VooPartida extends Voo {
    private String portaEmbarque;

    public VooPartida(String id, String hora, String aeroporto, String portaEmbarque) {
        super(id, hora, aeroporto);
        this.portaEmbarque = portaEmbarque;
    }

    @Override
    public String toString() {
        return String.format("<VooPartida %s> parte %s na porta %s", id, hora, portaEmbarque);
    }
}