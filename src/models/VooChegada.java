// Subclasse VooChegada
package models;

public class VooChegada extends Voo {
    public enum EstadoChegada { ATRASADO, CANCELADO, ATERRADO, RECOLHA, BAGAGEM }

    private String tapeteRecolhaBagagem;
    private EstadoChegada estado;

    public VooChegada(String id, String hora, String aeroporto, String tapete) {
        super(id, hora, aeroporto);
        this.tapeteRecolhaBagagem = tapete;
        this.estado = EstadoChegada.ATERRADO; // Estado padrão
    }

    public void setEstado(EstadoChegada novoEstado) {
        this.estado = novoEstado;
    }

    @Override
    public String toString() {
        return String.format("<VooChegada %s> chega %s no tapete %s [%s]", id, hora, tapeteRecolhaBagagem, estado);
    }
}
