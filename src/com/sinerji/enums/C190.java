package com.sinerji.enums;

public enum C190 {

    C190(1, "C190 Fixo"),
    CST_DE_ICMS(2, "CST de ICMS"),
    CFOP(3, "CFOP"),
    ALIQUOTA_DE_ICMS(4, "Alíquota de ICMS"),
    VALOR_DA_OPERACAO(5, "Valor da Operação"),
    BASE_DE_ICMS(6, "Base de ICMS"),
    VALOR_DE_ICMS(7, "Valor de ICMS"),
    BASE_DE_ICMS_ST(8, "Base de ICMS ST"),
    VALOR_DE_ICMS_ST(9, "Valor de ICMS ST"),
    VALOR_REDUCAO_DE_BASE_DE_ICMS(10, "Valor Redução de Base de ICMS"),
    VALOR_DE_IPI(11, "Valor de IPI"),
    CODIGO_DE_OBSERVACOES(12, "Código de Observações");

    private int position;
    private String nameColumn;

    private C190(int position, String nameColumn) {
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
        for (C190 e : values()) {
            if (e.position == position)
                return e.getNameColumn();
        }
        return "Campo desconhecido";
    }    
}
