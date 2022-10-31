package edson;

import edson.iterator.GrupoIterator;

public class Main {
    public static void main(String[] args) {
	Usuario usuario = new Usuario("Francisco Edson", "edsonjr", "123456", new Grupo(1, "Grupo Administrado"), 
		new Grupo(2, "Usuário conta PF"), new Grupo(3, "Usuário BETA"));
	
	GrupoIterator iterator = (GrupoIterator) usuario.getIterator();
	iterator.imprimirGrupos();
    }
}
