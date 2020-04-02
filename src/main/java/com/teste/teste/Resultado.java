package com.teste.teste;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "cResultado", namespace = "http://tempuri.org/")
public class Resultado {

    @JacksonXmlProperty(localName = "Servicos")
    private ListaServico servicos;
}
