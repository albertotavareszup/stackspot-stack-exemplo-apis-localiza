package com.example.demo;

public class ResumoHorariosFuncionamentoAgenciaResponse {

	private final String diaSemana;
	private final boolean aberto24Horas;

	public ResumoHorariosFuncionamentoAgenciaResponse(String diaSemana,
			boolean aberto24Horas) {
		super();
		this.diaSemana = diaSemana;
		this.aberto24Horas = aberto24Horas;
	}

	@Override
	public String toString() {
		return "ResumoHorariosFuncionamentoAgenciaResponse [diaSemana="
				+ diaSemana + ", aberto24Horas=" + aberto24Horas + "]";
	}

}
