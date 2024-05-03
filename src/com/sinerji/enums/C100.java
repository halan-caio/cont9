package com.sinerji.enums;

public enum C100 {
    C100(1, "C100-fixo"),   
    INDICADOR_OPERACAO(2, "Indicador de Operação"),
    INDICADOR_EMISSAO(3, "Indicador de emissão"),
    PARTICIPANTE(4, "Participante"),
    MODELO(5, "Modelo"),
    SITUACAO(6, "Situação"),
    SERIE(7, "Série"),
    NUMERO(8, "Numero"),
    CHAVE(9, "Chave"),
    DATA_EMISSAO(10, "Data de Emissão"),
    DATA_ENTREGA_SAIDA(11, "Data de Entrega/Saída"),
    VALOR(12,"Valor"),
    PAGAMENTO(13, "Pagamento"),
    DESCONTO(14, "Desconto"),
    ABATIMENTO(15, "Abatimento"),
    VALOR_DAS_MERCADORIAS(16, "Valor das Mercadorias"),
    TIPO_DE_FRETE(17, "Tipo de Frete"),
    VALOR_DO_FRETE(18, "Valor do Frete"),
    VALOR_DO_SEGURO(19, "Valor do Seguro"),
    DESPESAS_ACESSORIAS(20, "Despesas Acessórias"),
    BC_DE_ICMS(21, "BC de ICMS"),
    VALOR_ICMS(22, "Valor ICMS"),
    BC_DE_ICMS_ST(23, "BC de ICMS ST"),
    VALOR_DE_ICMS_ST(24, "Valor de ICMS ST"),
    VALOR_DE_IPI(25, "Valor de IPI"),
    VALOR_DE_PIS(26, "Valor de PIS"),
    VALOR_DE_COFINS(27, "Valor de COFINS"),
    VALOR_DE_PIS_ST(28, "Valor de PIS ST"),
    VALOR_DE_COFINS_ST(29, "Valor de COFINS ST");

    private int position;
    private String nameColumn;

    private C100(int position, String nameColumn) {
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
        for (C100 e : values()) {
            if (e.position == position)
                return e.getNameColumn();
        }
        return "Campo desconhecido";
    }

}
