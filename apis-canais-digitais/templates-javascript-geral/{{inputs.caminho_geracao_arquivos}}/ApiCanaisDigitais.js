 export default class ApiCanaisDigitais {

     static async getAutenticado(caminho,clientId){             
            if(!clientId){
                throw new Error("Precisa do client id para fazer requisicao")
            }
            const res = await fetch(caminho, {
                method: 'get',
                headers: {              
                    client_id: `${clientId}`
                }
                
            })
                    
            if(res.status >= 400) {
                const error = new Error("Aconteceu um problema inesperado na requisicao")            
                error.status = res.status
                throw error
            }                

            return res;
            
    }       
    
    /**
     * 
     * @param {*} cidade nome da cidade que supostamente tem agências
     */
    static async listaAgencias(cidade){
        return ApiCanaisDigitais.getAutenticado(`https://canaisdigitais-api.localiza.com/al-canaisdigitais-site/v1/Agencias/localidade/${cidade}`,"{{inputs.client_id}}").json()        
    }

    /**
     * 
     * @param {*} codigoLocaliza codigo da localiza que identifica a cidade. Você acessá-lo olhando para o retorno do endpoint que lista agencias
     */
     static async listaHorariosAgencia(codigoLocaliza){
        return ApiCanaisDigitais.getAutenticado(`https://canaisdigitais-api.localiza.com/al-canaisdigitais-site/v1/Agencias/${codigoLocaliza}/datas-disponiveis-locacao`,"{{inputs.client_id}}").json()        
    }    

}
