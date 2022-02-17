import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String questao1 = "Qual é a cor do céu?\n"
                        + "[a]-Vermelho\n[b]-Azul\n[c]-marrom\n";

        String questao2 = "Qual é o tomate é?\n"
                        + "[a]-frutas\n[b]-legumes\n[c]-vegetais\n";

        Questao [] questoes = {new Questao(questao1,"b"),
                               new Questao(questao2, "b")};

                        fazerTeste(questoes);


    }

    public static void fazerTeste(Questao [] questoes){
        int pontuacao = 0;
        Scanner respostaUsuario = new Scanner(System.in);

        for(int i = 0;i < questoes.length;i++){
            System.out.println(questoes[i].pergunta);
            String respostas = respostaUsuario.nextLine();
            if(respostas.equals(questoes[i].resposta)){
                pontuacao++;
            }
        }

        System.out.println("Você acertou " + pontuacao + "/" + questoes.length);
    }
}
