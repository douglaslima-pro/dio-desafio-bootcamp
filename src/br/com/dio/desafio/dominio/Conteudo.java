package br.com.dio.desafio.dominio;

import java.util.Objects;

public abstract class Conteudo {

	protected static final double XP_PADRAO = 10d;
	
	protected String titulo;
	protected String descricao;
	
	public abstract double calcularXp();
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.titulo, this.descricao);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Conteudo c)) {
			return false;
		}
		return this.titulo.equalsIgnoreCase(c.getTitulo()) && this.descricao.equalsIgnoreCase(c.getDescricao());
	}
	
}