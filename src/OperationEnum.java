public enum OperationEnum {
    ADDIZIONE("addizione"),
    SOTTRAZIONE("sottrazione"),
    MOLTIPLICAZIONE("moltiplicazione"),
    DIVISIONE("divisione"),
    VALOREMAX("valore massimo"),
    VALOREMIN("valore minimo");

    private String operazione;

    OperationEnum(String operazione){
        this.operazione = operazione;
    }

    public String getOperazione() {
        return operazione;
    }
}
