public class Alunos {
    public static void main(String[] args) throws Exception {
        double soma=0;
        if(args.length < 10 || args.length > 10 ){
            System.out.println("Numeros de notas tem que ser 10");
            return;
        }

        for(int i=0; i < 10; i++){
            int valor = Integer.parseInt(args[i]);
            System.out.print("Aluno [" + i + "] ");
            for(int j=0; j < valor; j++){
                System.out.print("*");
            }
            System.out.println("");
            soma += valor;
        }
        System.out.println("Media: " + soma/args.length);
    }
}
