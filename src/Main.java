//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
//(Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum,
//crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
//Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BigDecimal number1 = new BigDecimal(15);
        BigDecimal number2 = new BigDecimal(10);

        operazioni(number1,number2);
    }
    public static void operazioni(BigDecimal number1,BigDecimal number2){
        System.out.println(number1.add(number2));
        System.out.println(number1.subtract(number2));
        System.out.println(number1.multiply(number2));
        System.out.println(number1.divide(number2));
        System.out.println(number1.min(number2));
        System.out.println(number1.max(number2));
    }
}