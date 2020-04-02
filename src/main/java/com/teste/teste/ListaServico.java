package com.teste.teste;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListaServico {

    @JacksonXmlProperty(localName = "cServico")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Servico> cServico;
}
