public class BalancoTrimestral {
    public static void main(String[] args) throws Exception {
        int gastosJaneiro = 15000;
        int gastosFevereiro  = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediaMensal = gastosTrimestre / 3;
        
        System.out.println("Valor da média mensal = " + mediaMensal);
    }
}
