//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
//(Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum,
//crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal(15);
        BigDecimal number2 = new BigDecimal(10);

        operazioni(number1,number2,OperationEnum.DIVISIONE);
    }
    public static void operazioni(BigDecimal number1,BigDecimal number2,OperationEnum operazione){
        BigDecimal result;
        BigDecimal resultscaled;
        switch (operazione.getOperazione()) {
            case "addizione":
                result = number1.add(number2);
                resultscaled = result.setScale(2,RoundingMode.HALF_EVEN);
                System.out.println("risultato della " + operazione.getOperazione() + " è: " + result);
                System.out.println("risultato scalato della " + operazione.getOperazione() + " è: " + resultscaled);
                break;
            case "sottrazione":
                result = number1.subtract(number2);
                resultscaled = result.setScale(3,RoundingMode.HALF_EVEN);
                System.out.println("risultato della " + operazione.getOperazione() + " è: " + result);
                System.out.println("risultato scalato della " + operazione.getOperazione() + " è: " + resultscaled);
                break;
            case "moltiplicazione":
                result = number1.multiply(number2);
                resultscaled = result.setScale(2,RoundingMode.HALF_EVEN);
                System.out.println("risultato della " + operazione.getOperazione() + " è: " + result);
                System.out.println("risultato scalato della " + operazione.getOperazione() + " è: " + resultscaled);
                break;
            case "divisione":
                result = number1.divide(number2);
                resultscaled = result.setScale(2,RoundingMode.HALF_EVEN);
                System.out.println("risultato della " + operazione.getOperazione() + " è: " + result);
                System.out.println("risultato scalato della " + operazione.getOperazione() + " è: " + resultscaled);
                break;
            case "valore massimo":
                result = number1.max(number2);
                resultscaled = result.setScale(2,RoundingMode.HALF_EVEN);
                System.out.println("risultato della " + operazione.getOperazione() + " è: " + result);
                System.out.println("risultato scalato della " + operazione.getOperazione() + " è: " + resultscaled);
                break;
            case "valore minimo":
                result = number1.min(number2);
                resultscaled = result.setScale(2,RoundingMode.HALF_EVEN);
                System.out.println("risultato della " + operazione.getOperazione() + " è: " + result);
                System.out.println("risultato scalato della " + operazione.getOperazione() + " è: " + resultscaled);

        }
    }
}