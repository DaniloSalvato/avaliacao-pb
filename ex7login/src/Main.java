import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String login1 = "admin";
        String login2 = "alura";
        String login3 = "teste";

        String password1 = "senha123";
        String password2 = "teste123";
        String password3 = "alura123";

        ArrayList<User>users = new ArrayList<>();
        users.add(new User (login1, password1));
        users.add(new User (login2, password2));
        users.add(new User (login3, password3));

        fazerLogin(users);
    }

        public static void fazerLogin(ArrayList<User>users){

            Date dataHoraAtual = new Date();
            String hora = new SimpleDateFormat("HH").format(dataHoraAtual);
            int intHora = Integer.parseInt(hora);

            Scanner sc = new Scanner(System.in);

            System.out.println("Login -> ");
            String loginEntrada = sc.next();

            System.out.println("Senha -> ");
            String senhaEntrada = sc.next();


            for (int i = 0; i < users.size();i++) {

                if (loginEntrada.equals(users.get(i).login) && senhaEntrada.equals(users.get(i).senha)) {
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
                        System.out.println("Boa madrugada, você se logou ao nosso sistema.");
                        break;
                    }

                } if(i == (users.size()-1)) {
                    System.out.println("Usuário e/ou senha incorretos.");
                }
            }

        }



}

