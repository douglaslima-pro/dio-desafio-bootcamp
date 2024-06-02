package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	
	private int cargaHoraria;
	
	public double calcularXp() {
		return XP_PADRAO * this.cargaHoraria;
	}
	
	@Override
	public String toString() {
		return String.format("Curso{titulo='%s', descricao='%s', cargaHoraria=%d}", super.titulo, super.descricao, this.cargaHoraria);
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}