package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;
	
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Mentoria() {}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria: " + getTitulo() + "\n Descricao: " + getDescricao() + "\n data: " + data + "\n";
	}

	
	
	
}
