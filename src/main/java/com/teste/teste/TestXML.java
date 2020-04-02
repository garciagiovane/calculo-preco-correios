package com.teste.teste;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
public class TestXML {

    private RestTemplate restTemplate;

    public void mapXml() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> bodyRequest = new LinkedMultiValueMap<>();
        bodyRequest.add("nCdEmpresa", "");
        bodyRequest.add("sDsSenha", "");
        bodyRequest.add("sCepOrigem", "92900000");
        bodyRequest.add("sCepDestino", "94834680");
        bodyRequest.add("nVlPeso", "1");
        bodyRequest.add("nCdFormato", "1");
        bodyRequest.add("nVlComprimento", "16");
        bodyRequest.add("nVlAltura", "5");
        bodyRequest.add("nVlLargura", "11");
        bodyRequest.add("nVlDiametro", "0");
        bodyRequest.add("sCdMaoPropria", "N");
        bodyRequest.add("nVlValorDeclarado", "0");
        bodyRequest.add("sCdAvisoRecebimento", "N");
        bodyRequest.add("nCdServico", ",");

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(bodyRequest, headers);

        System.out.println("Criou a request");

        var response = restTemplate.postForObject(
                "http://ws.correios.com.br/calculador/CalcPrecoPrazo.asmx/CalcPrecoPrazo", request, Resultado.class);

        System.out.println("Fez a request");
        response.getServicos().getCServico().forEach(System.out::println);
    }
}
