package entidades;

import java.time.LocalDate;

public class ContratoHora {
	private LocalDate data;
	private Double valorPorHora;
	private Double horas;
	
	public ContratoHora() {
	}
	public ContratoHora(LocalDate data, Double valorPorHora) {
		super();
		this.data = data;
		this.valorPorHora = valorPorHora;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	public double getValorTotal() {
		return horas * valorPorHora;
	}

	@Override
	public String toString() {
		return "ContratoHora [data=" + data + ", valorPorHora=" + valorPorHora + "]";
	}
	
	

}
