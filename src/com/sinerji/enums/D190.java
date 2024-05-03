package com.sinerji.enums;

public enum D190 {

    D190(1, "D190 Fixo"),
    CST_DE_ICMS(2, "CST de ICMS"),
    CFOP(3, "CFOP"),
    ALIQUOTA_DE_ICMS(4, "Alíquota de ICMS"),
    VALOR_DA_OPERACAO(5, "Valor da Operação"),
    BASE_DE_ICMS(6, "Base de ICMS"),
    VALOR_DE_ICMS(7, "Valor de ICMS"),
    VALOR_NAO_TRIBUTADO_DE_ICMS(8, "Valor Não Tributado de ICMS"),
    CODIGO_DE_OBSERVACOES(9, "Código de Observações");

    private int position;
    private String nameColumn;

    private D190(int position, String nameColumn) {
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
        for (D190 e : values()) {
            if (e.position == position)
                return e.getNameColumn();
        }
        return "Campo desconhecido";
    }    
}
