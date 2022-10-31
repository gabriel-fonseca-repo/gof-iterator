package edson;

public class Grupo {
    private Integer id;
    private String nome;

    public Grupo(Integer id, String nome) {
	this.id = id;
	this.nome = nome;
    }

    public Integer getId() {
	return id;
    }

    public String getNome() {
	return nome;
    }

}
