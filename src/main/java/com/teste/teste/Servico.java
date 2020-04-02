package com.teste.teste;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Servico {

    @JacksonXmlProperty(localName = "Codigo")
    private Integer codigo;
    @JacksonXmlProperty(localName = "Valor")
    private String valor;
    @JacksonXmlProperty(localName = "PrazoEntrega")
    private String prazoEntrega;
    @JacksonXmlProperty(localName = "ValorMaoPropria")
    private String valorMaoPropria;
    @JacksonXmlProperty(localName = "ValorAvisoRecebimento")
    private String valorAvisoRecebimento;
    @JacksonXmlProperty(localName = "ValorValorDeclarado")
    private String valorValorDeclarado;
    @JacksonXmlProperty(localName = "EntregaDomiciliar")
    private String entregaDomiciliar;
    @JacksonXmlProperty(localName = "EntregaSabado")
    private String entregaSabado;
    @JacksonXmlProperty(localName = "Erro")
    private String erro;
    @JacksonXmlProperty(localName = "MsgErro")
    private String msgErro;
    @JacksonXmlProperty(localName = "ValorSemAdicionais")
    private String valorSemAdicionais;
    @JacksonXmlProperty(localName = "obsFim")
    private String obsFim;
}
