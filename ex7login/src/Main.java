import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String login1 = "admin";
        String login2 = "alura";
        String password1 = "senha123";
        String password2 = "teste123";

        User[] usuarios = {new User(login1, password1), new User(login2, password2)};

        fazerLogin(usuarios);
    }

        public static void fazerLogin(User [] usuarios){

            Date dataHoraAtual = new Date();
            String hora = new SimpleDateFormat("HH").format(dataHoraAtual);
            int intHora = Integer.parseInt(hora);

            Scanner sc = new Scanner(System.in);

            System.out.println("Login -> ");
            String loginEntrada = sc.nextLine();

            System.out.println("Senha -> ");
            String senhaEntrada = sc.nextLine();


            for (int i = 0; i < usuarios.length; i++) {

                if (loginEntrada.equals(User.login) && senhaEntrada.equals(User.senha)) {
                    if (intHora >= 6 && intHora < 12) {
                        System.out.println("Bom dia, você se logou ao nosso sistema.");
                        break;
                    } else if (intHora >= 12 && intHora < 18) {
                        System.out.println("Boa tarde, você se logou ao nosso sistema.");
                        break;
                    } else if (intHora >= 18 && intHora < 24) {
                        System.out.println("Boa noite, você se logou ao nosso sistema.");
                        break;
                    } else {
                        System.out.println("Boa madrugada, você se logou ao nosso\n" +
                                "sistema.");
                        break;
                    }

                } else {
                    System.out.println("Usuário e/ou senha incorretos.");
                    break;
                }
            }

        }



}

