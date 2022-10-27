package gabriel.aeroporto;


import gabriel.iterator.ViagemAereaIterator;

import java.util.ArrayList;
import java.util.List;

public class ViagemAerea {

    private List<Voo> trechos;

    public ViagemAerea() {
        this.trechos = new ArrayList<>();
    }

    public void adicionarTrechoAereo(Voo trecho) {
        this.trechos.add(trecho);
    }

    public String getOrigem() {
        return this.trechos.get(0).getOrigem();
    }

    public String getDestino() {
        return this.trechos.get(this.trechos.size() - 1).getDestino();
    }

    public ViagemAereaIterator getIterator() {
        return new ViagemAereaIterator(trechos);
    }

    public List<Voo> getTrechos() {
        return trechos;
    }

    public void setTrechos(List<Voo> trechos) {
        this.trechos = trechos;
    }
}
