
// Classe PainelInformativo
package models;

import exceptions.VooExistenteException;
import java.util.HashSet;
import java.util.Set;

public class PainelInformativo {
    private String titulo;
    private Set<Voo> voos;

    public PainelInformativo(String titulo) {
        this.titulo = titulo;
        this.voos = new HashSet<>();
    }

    public void adicionarVoo(Voo voo) throws VooExistenteException {
        if (!voos.add(voo)) {
            throw new VooExistenteException("Voo com ID " + voo.getId() + " já existe no painel.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(titulo + "\n");
        for (Voo voo : voos) {
            sb.append(voo.toString()).append("\n");
        }
        return sb.toString();
    }
}
