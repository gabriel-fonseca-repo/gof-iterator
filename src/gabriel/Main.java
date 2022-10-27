package gabriel;

import gabriel.aeroporto.SistemaAereo;
import gabriel.aeroporto.ViagemAerea;
import gabriel.aeroporto.Voo;

public class Main {
    public static void main(String[] args) {
        // Cenário aeroporto
        ViagemAerea viagem = new ViagemAerea();
        Voo trecho = new Voo("Fortaleza", "São Paulo", 843.89);
        viagem.adicionarTrechoAereo(trecho);
        trecho = new Voo("São Paulo", "Londres", 2727.38);
        viagem.adicionarTrechoAereo(trecho);

        SistemaAereo sistema = new SistemaAereo();
        System.out.println(sistema.getCustoViagem(viagem));

    }
}
