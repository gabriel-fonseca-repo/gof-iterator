package gabriel.aeroporto;

public class Voo {

    private String origem, destino;
    private Double custo;

    public Voo(String origem, String destino, Double custo) {
	this.origem = origem;
	this.destino = destino;
	this.custo = custo;
    }

    public Double getCusto() {
	return custo;
    }

    public String getOrigem() {
	return this.origem;
    }

    public String getDestino() {
	return this.destino;
    }

    public void setOrigem(String origem) {
	this.origem = origem;
    }

    public void setDestino(String destino) {
	this.destino = destino;
    }

    public void setCusto(Double custo) {
	this.custo = custo;
    }
}
