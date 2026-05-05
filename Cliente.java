import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a porta do servidor que deseja se conectar:");
        int porta = input.nextInt();
        input.nextLine();

        try {
            // Tenta se conectar com a porta no servidor
            Socket conexao = new Socket("localhost", porta);
            System.out.println("Conectado ao servidor");

            // Escrever algo e enviar pela conexão com o server
            PrintWriter escritor = new PrintWriter(conexao.getOutputStream(), true);

            System.out.println("Digite uma mensagem para enviar ao servidor:");
            String mensagem = input.nextLine();

            // Enviando a mensagem
            escritor.println(mensagem);

            // Fecha tudo que precisar
            escritor.close();
            conexao.close();
            input.close();
            System.out.println("Conexão encerrada e mensagem enviada ");

        } catch (IOException erro) {
            System.out.println("Não deu para achar o servidor");
        }
    }
}