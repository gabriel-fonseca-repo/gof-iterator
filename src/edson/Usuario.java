package edson;

import java.util.Arrays;
import java.util.List;

import edson.iterator.GrupoIterator;
import interfaces.Iterable;
import interfaces.Iterator;

public class Usuario implements Iterable<Grupo> {
    private String nome;
    private String login;
    private String senha;
    private List<Grupo> grupos;
    
    public Usuario(String nome, String login, String senha, Grupo ...grupos) {
	this.grupos = Arrays.asList(grupos);
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public String getSenha() {
	return senha;
    }

    public void setSenha(String senha) {
	this.senha = senha;
    }

    public List<Grupo> getGrupos() {
	return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
	this.grupos = grupos;
    }

    @Override
    public Iterator<Grupo> getIterator() {
	return new GrupoIterator(this.grupos);
    }
}
