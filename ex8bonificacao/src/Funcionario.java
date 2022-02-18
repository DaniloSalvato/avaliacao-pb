public class Funcionario {
    String nome;
    double salario;
    double bonificacao;
    double salarioLiquido;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

        //salário liquido
        if(this.salario <= 1000){
            this.salarioLiquido = salario *  1.2;
        }else if(this.salario <= 2000){
            this.salarioLiquido = salario *  1.1;
        }else{
            this.salarioLiquido = salario *  0.9;
        }

        this.bonificacao = this.salarioLiquido - this.salario;

    }
}



