package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

public class DetalheAgenciaReponse {

	private final boolean aeroporto;
	private final String codigoLocaliza;
	private final String nome;
	private final boolean fast;
	private final String telefone;
	private final String whatsapp;
	private final BigDecimal latitude;
	private final BigDecimal longitude;
	private final List<DetalheEnderecoAgenciaResponse> enderecos;
	private final List<ResumoHorariosFuncionamentoAgenciaResponse> resumoHorariosFuncionamento;

	public DetalheAgenciaReponse(boolean aeroporto, String codigoLocaliza,
			String nome, boolean fast, String telefone, String whatsapp,
			BigDecimal latitude, BigDecimal longitude,
			List<DetalheEnderecoAgenciaResponse> enderecos,
			List<ResumoHorariosFuncionamentoAgenciaResponse> resumoHorariosFuncionamento) {
		super();
		this.aeroporto = aeroporto;
		this.codigoLocaliza = codigoLocaliza;
		this.nome = nome;
		this.fast = fast;
		this.telefone = telefone;
		this.whatsapp = whatsapp;
		this.latitude = latitude;
		this.longitude = longitude;
		this.enderecos = enderecos;
		this.resumoHorariosFuncionamento = resumoHorariosFuncionamento;
	}

	@Override
	public String toString() {
		return "DetalheAgenciaReponse [aeroporto=" + aeroporto
				+ ", codigoLocaliza=" + codigoLocaliza + ", nome=" + nome
				+ ", fast=" + fast + ", telefone=" + telefone + ", whatsapp="
				+ whatsapp + ", latitude=" + latitude + ", longitude="
				+ longitude + ", enderecos=" + enderecos
				+ ", resumoHorariosFuncionamento=" + resumoHorariosFuncionamento
				+ "]";
	}

}
