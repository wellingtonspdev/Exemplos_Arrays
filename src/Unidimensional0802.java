class Exemplo02{
    public static void main(String[] args) {
        String nomes = "";
        char caracterArray[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        System.out.println("Array: " + String.valueOf(caracterArray));
        System.out.println("Quant. de elementos: " + caracterArray.length);
        System.out.println("3 primeiros caracteres do array: " + String.valueOf(caracterArray, 0, 3));
        System.out.println();

        // Criando um Array de String.
        String stringArray[] = {"Aprendendo", " ", "a", " ", "linguagem", " ", "java"};
        for(int i=0; i<stringArray.length; i++){
            nomes=nomes+stringArray[i];
        }
        System.out.println("Quant. de elementos: " + stringArray.length);
        System.out.println("Primeiro elemento: "+stringArray[0]);
        System.out.println("Ultimo elemento"+stringArray[stringArray.length-1]);
    }
}