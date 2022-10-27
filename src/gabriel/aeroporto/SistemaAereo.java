package gabriel.aeroporto;

import gabriel.iterator.ViagemAereaIterator;

public class SistemaAereo {
    public SistemaAereo() {

    }

    public double getCustoViagem(ViagemAerea viagem) {
        ViagemAereaIterator iterador = viagem.getIterator();
        double custo = 0.0;
        while (iterador.hasNext()) {
            custo += iterador.next().getCusto();
        }
        return custo;
    }
}
