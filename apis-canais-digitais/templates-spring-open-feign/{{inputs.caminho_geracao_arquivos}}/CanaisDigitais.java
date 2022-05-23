package coloque_aqui_o_pacote;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import feign.Headers;

@FeignClient(url = "https://canaisdigitais-api.localiza.com/al-canaisdigitais-site/v1/", name = "canais-digitais")
@Headers({"client_id:{{inputs.client_id}}","user-agent:stackspot"})
public interface CanaisDigitais {

	@GetMapping("/Agencias/localidade/{cidade}")
	public List<AgenciaResponse> listaAgencias(@PathVariable("cidade") String cidade);
	
	@GetMapping("/Agencias/{codigoLocaliza}/datas-disponiveis-locacao")
	public Map<?,?> listaHorariosAgencia(@PathVariable("codigoLocaliza") String codigoLocaliza);
}
