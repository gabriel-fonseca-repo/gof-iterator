package gabriel.iterator;

import gabriel.aeroporto.Voo;
import interfaces.Iterator;

import java.util.List;


public class ViagemAereaIterator implements Iterator<Voo> {
    private List<Voo> trechos;
    Integer position;

    public ViagemAereaIterator(List<Voo> trechos) {
        this.trechos = trechos;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < trechos.size();
    }

    @Override
    public Voo next() {
        Voo trecho = trechos.get(position);
        this.position = this.position + 1;
        return trecho;
    }

    public List<Voo> getTrechos() {
        return trechos;
    }

    public void setTrechos(List<Voo> trechos) {
        this.trechos = trechos;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
