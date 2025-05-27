class Main {

    public static void main(String[] args) {
        Pessoa pessoa[] = new Pessoa[100]; // Cria um array com 100 objetos

        // cria todos os objetos
        for (int i = 0; i < 100; i++) {
            pessoa[i] = new Pessoa();
        }

        pessoa[0].setNome("Fernanda");
        pessoa[1].setNome("Lucas");
        pessoa[2].setNome("Daniel");
        pessoa[3].setNome("Isabel");
        pessoa[4].setNome("Tatiane");

        for (int i = 0; i <= 4; i++) {
            System.out.println("Pessoa n° " + i + ": " + pessoa[i].getNome());
        }
    }
}