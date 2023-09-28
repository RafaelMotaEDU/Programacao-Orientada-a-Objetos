public class Fatorial {
    public static void main(String[] args) throws Exception {
        int valor = 5;
        int fatorial = 1; 

        for(int i = 1; i <= valor; i++){
            fatorial *= i;
        }

        System.out.println(fatorial);
    }
}
