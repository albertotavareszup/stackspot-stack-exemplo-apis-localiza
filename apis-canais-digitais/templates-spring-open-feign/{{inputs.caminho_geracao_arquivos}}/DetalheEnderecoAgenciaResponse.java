package com.example.demo;

public class DetalheEnderecoAgenciaResponse {

	private final TipoEnderecoResponse tipo;
	private final String logadouro;
	private final String cep;
	private final String uf;
	private final String cidade;
	private final String codigoPais;

	public DetalheEnderecoAgenciaResponse(TipoEnderecoResponse tipo,
			String logadouro, String cep, String uf, String cidade,
			String codigoPais) {
		super();
		this.tipo = tipo;
		this.logadouro = logadouro;
		this.cep = cep;
		this.uf = uf;
		this.cidade = cidade;
		this.codigoPais = codigoPais;
	}

	@Override
	public String toString() {
		return "DetalheEnderecoAgenciaResponse [tipo=" + tipo + ", logadouro="
				+ logadouro + ", cep=" + cep + ", uf=" + uf + ", cidade="
				+ cidade + ", codigoPais=" + codigoPais + "]";
	}

}
