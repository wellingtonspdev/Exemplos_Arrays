public class Exemplo0801 {

    public static void main(String[] args) {
        int total = 0;

        if (args.length > 0) {
            int[] n = new int[args.length];
            try {
                for (int i = 0; i < args.length; i++) {
                    n[i] = Integer.parseInt(args[i]);
                    total += n[i];
                }

                System.out.println("Os números digitados na ordem inversa foram");

                for (int i = args.length - 1; i >= 0; i--) {
                    System.out.print(n[i]);
                    if (i > 0) {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // Nova linha após os números invertidos

                System.out.println("Somatórios dos números =" + total);
                System.out.println("Média entre eles =" + (total / args.length));

            } catch (NumberFormatException erro) {
                System.out.println("Erro, todos os argumentos devem ser numericos inteiros");
            }
        } else {
            System.out.println("Nenhum argumento foi fornecido.");
        }
    }
}