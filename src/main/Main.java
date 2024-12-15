
// Classe Main para testes
package main;

import exceptions.VooExistenteException;
import models.*;

public class Main {
    public static void main(String[] args) {
        try {
            Aeroporto aeroporto = new Aeroporto("Aeroporto Internacional de Lisboa");

            // Criar painéis informativos
            PainelInformativo partidas = new PainelInformativo("Voos de Partida");
            PainelInformativo chegadas = new PainelInformativo("Voos de Chegada");

            // Adicionar voos
            VooPartida vp1 = new VooPartida("TP123", "10:00", "Lisboa", "A3");
            VooChegada vc1 = new VooChegada("BA456", "12:30", "Londres", "T1");
            vc1.setEstado(VooChegada.EstadoChegada.ATRASADO);

            // Adicionar voos aos painéis
            partidas.adicionarVoo(vp1);
            chegadas.adicionarVoo(vc1);

            // Adicionar painéis ao aeroporto
            aeroporto.adicionarPainel(partidas);
            aeroporto.adicionarPainel(chegadas);

            // Exibir informações
            for (PainelInformativo painel : aeroporto.getPaineisInformativos()) {
                System.out.println(painel);
            }

        } catch (VooExistenteException e) {
            System.err.println(e.getMessage());
        }
    }
}
