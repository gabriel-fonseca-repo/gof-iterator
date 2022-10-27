package gabriel.aeroporto;

import java.util.ArrayList;
import java.util.List;

import gabriel.iterator.ViagemAereaIterator;
import interfaces.Iterable;

public class ViagemAerea implements Iterable<Voo> {

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

    @Override
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
