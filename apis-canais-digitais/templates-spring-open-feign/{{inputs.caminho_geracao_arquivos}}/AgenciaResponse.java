package coloque_aqui_o_pacote;

import java.util.List;

public class AgenciaResponse {

	private final String codigoPais;
	private final String nomePais;
	private final List<DetalheAgenciaReponse> agencias;
	private final boolean agenciaParceiro;
	private final boolean agenciaFranqueado;
	private final boolean brasileira;

	public AgenciaResponse(String codigoPais, String nomePais,
			List<DetalheAgenciaReponse> agencias, boolean agenciaParceiro,
			boolean agenciaFranqueado, boolean brasileira) {
		super();
		this.codigoPais = codigoPais;
		this.nomePais = nomePais;
		this.agencias = agencias;
		this.agenciaParceiro = agenciaParceiro;
		this.agenciaFranqueado = agenciaFranqueado;
		this.brasileira = brasileira;
	}

	@Override
	public String toString() {
		return "AgenciaResponse [codigoPais=" + codigoPais + ", nomePais="
				+ nomePais + ", agencias=" + agencias + ", agenciaParceiro="
				+ agenciaParceiro + ", agenciaFranqueado=" + agenciaFranqueado
				+ ", brasileira=" + brasileira + "]";
	}

}
