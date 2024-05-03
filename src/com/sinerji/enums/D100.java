package com.sinerji.enums;

public enum D100 {

    D100(1, "D100 Fixo"),
    INDICADOR_DE_OPERACAO(2, "Indicador de Operação"),
    INDICADOR_DE_EMISSAO(3, "Indicador de Emissão"),
    PARTICIPANTE(4, "Participante"),
    MODELO(5, "Modelo"),
    SITUACAO(6, "Situação"),
    SERIE(7, "Série"),
    SUB_SERIE(8, "Sub Série"),
    NUMERO(9, "Número"),
    CHAVE(10, "Chave"),
    DATA_DE_EMISSAO(11, "Data de Emissão"),
    DATA_DE_ENTRADA_SAIDA(12, "Data de Entrada/Saída"),
    TIPO_DE_CTE(13, "Tipo de CTE"),
    CHAVE_DE_CTE_REF(14, "Chave de CTE Ref"),
    VALOR(15, "Valor"),
    DESCONTO(16, "Desconto"),
    TIPO_DE_FRETE(17, "Tipo de Frete"),
    VALOR_DO_SERVICO(18, "Valor do Serviço"),
    BC_DE_ICMS(19, "BC de ICMS"),
    VALOR_DE_ICMS(20, "Valor de ICMS"),
    VALOR_NAO_TRIBUTARIO_DE_ICMS(21, "Valor Não Tributário de ICMS"),
    INFORMACAO_COMPLEMENTAR(22, "Informação Complementar"),
    CONTA_CONTABIL(23, "Conta Contábil"),
    CODIGO_MUNICIPIO_ORIGEM(24, "Código Município Origem"),
    CODIGO_MUNICIPIO_DESTINO(25, "Código Município Destino");

    private int position;
    private String nameColumn;

    private D100(int position, String nameColumn) {
        this.position = position;
        this.nameColumn = nameColumn;
    }

    public int getId() {
        return position;
    }

    public String getNameColumn() {
        return nameColumn;
    }

    public static String getNameColumnById(int position) {
        for (D100 e : values()) {
            if (e.position == position)
                return e.getNameColumn();
        }
        return "Campo desconhecido";
    }    
}
