import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o número de funcionários? ");
        int nFuncionarios = parseInt(sc.next());

        for(int i = 0; i < nFuncionarios;i++){

            System.out.println("Digite o nome do funcionário " + (i+1) + "º" );
            String nome = sc.next();

            System.out.println("Digite o salário " + (i+1)+ "º" );
            double salario = parseDouble(sc.next());

            System.out.println("");

            funcionarios.add(new Funcionario(nome, salario));
        }

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario.nome);
            System.out.println("Salário: " + funcionario.salario);
            if(funcionario.bonificacao < 0){
                System.out.println("Desconto: " + (funcionario.bonificacao * -1));
            }else{
                System.out.println("Bônus: " + funcionario.bonificacao);
            }
            System.out.println("Salário Líquido: " + funcionario.salarioLiquido);
            System.out.println("");
        }
    }

}
