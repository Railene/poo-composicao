package entidades;

import java.util.ArrayList;
import java.util.List;

import entidades.enums.NivelTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivel;
	private Double salarioBase;
	
	private Departamento departamento;
	
	private List<ContratoHora> contratos = new ArrayList<>();

	public Trabalhador( ) {
	}

	public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoHora> getContratos() {
		return contratos;
	}
	
	public void adicionarContrato(ContratoHora contrato) {
		contratos.add(contrato);
	} 
	
	public void removerContrato(ContratoHora contrato) {
		contratos.remove(contrato); 
	}
	
	public double getRenda(int ano, int mes) {
		double sum = salarioBase;
		for (ContratoHora c : contratos) {
			if (c.getData().getMonthValue() == mes && c.getData().getYear() == ano) {
				sum +=c.getValorTotal(); 
		}
			return sum;
	}
}
		

