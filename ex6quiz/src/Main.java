import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String questao1 = "Qual é a cor do céu?\n"
                        + "[a]-Vermelho\n[b]-Azul\n[c]-marrom\n";

        String questao2 = "Qual é o tomate é?\n"
                        + "[a]-fruta\n[b]-legume\n[c]-vegetal\n";

        Questao [] questoes = {new Questao(questao1,"b"),
                               new Questao(questao2, "a")};

                        fazerTeste(questoes);


    }

    public static void fazerTeste(Questao [] questoes){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        int pontuacao = 0;
        Scanner respostaUsuario = new Scanner(System.in);

        for(int i = 0;i < questoes.length;i++){
            System.out.println(questoes[i].pergunta);
            String respostas = respostaUsuario.nextLine();

            if(respostas.equals(questoes[i].resposta)){
                System.out.println("Você acertou!");
                System.out.println("");
                pontuacao++;
            }else{
                System.out.println("Você errou!");
                System.out.println("");
            }
        }
        int nQuestoes = questoes.length;

        System.out.println("");
        System.out.println("");
        System.out.println("|------------------------------------------|");
        System.out.println("| Usuário " + nome);
        System.out.println("|------------------------------------------|");
        System.out.println("| Acertos " + pontuacao);
        System.out.println("|------------------------------------------|");
        System.out.println("| Erros " + ( nQuestoes-pontuacao ));
        System.out.println("|------------------------------------------|");
    }
}
