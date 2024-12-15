// Classe Voo (superclasse)
package models;

public class Voo {
    protected String id;
    protected String hora;
    protected String aeroporto;

    public Voo(String id, String hora, String aeroporto) {
        this.id = id;
        this.hora = hora;
        this.aeroporto = aeroporto;
    }

    public String getId() {
        return id;
    }

    public String getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return String.format("<Voo %s> %s", id, aeroporto);
    }
}
