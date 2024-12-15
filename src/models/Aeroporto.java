
// Classe principal Aeroporto
package models;

import exceptions.VooExistenteException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Aeroporto {
    private String nome;
    private List<PainelInformativo> paineisInformativos;
    private Set<Voo> voos;

    public Aeroporto(String nome) {
        this.nome = nome;
        this.paineisInformativos = new ArrayList<>();
        this.voos = new HashSet<>();
    }

    public void adicionarPainel(PainelInformativo painel) {
        paineisInformativos.add(painel);
    }

    public void adicionarVoo(Voo voo) throws VooExistenteException {
        if (!voos.add(voo)) {
            throw new VooExistenteException("O voo " + voo.getId() + " já existe no aeroporto.");
        }
    }

    public List<PainelInformativo> getPaineisInformativos() {
        return paineisInformativos;
    }
}
