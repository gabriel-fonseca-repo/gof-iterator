package edson.iterator;

import java.util.List;

import edson.Grupo;
import interfaces.Iterator;

public class GrupoIterator implements Iterator<Grupo> {
    
    private List<Grupo> grupos;
    private Integer position;

    public GrupoIterator(List<Grupo> grupos) {
	this.grupos = grupos;
	this.setPosition(0);
    }

    @Override
    public boolean hasNext() {
	return getPosition() < grupos.size();
    }

    @Override
    public Grupo next() {
	return grupos.get(position++);
    }
    
    public void imprimirGrupos() {
	while (hasNext()) {
	    Grupo grupo = next();
	    System.out.println(grupo.getNome());
	}
    }

    public Integer getPosition() {
	return position;
    }

    public void setPosition(Integer position) {
	this.position = position;
    }
    
    public List<Grupo> getGrupos() {
	return grupos;
    }

}
