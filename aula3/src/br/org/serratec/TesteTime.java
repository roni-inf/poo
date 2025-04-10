package br.org.serratec;

public class TesteTime {
    public static void main(String[] args) {
        Time time = new Time("Vasco", "Carille", new Atleta[11]);
        
        Atleta atleta1 = new Atleta("Léo Jardim", 38);
        Atleta atleta2 = new Atleta("Coutinho", 39);
        Atleta atleta3 = new Atleta("Payet", 36);

        time.adicionarAtleta(atleta1);
        time.adicionarAtleta(atleta2);
        time.adicionarAtleta(atleta3);

        time.imprimirElenco();

        String[]nomes = {"Ana","Carlos"};
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
