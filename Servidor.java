// Programa que simula requisição HTTP usando sockets 

// Para tratar exceções
import java.io.IOException;

// Para usar os métodos ServerSocket e Socket 
import java.net.*;

// Para ler inputs do usuário 
import java.util.Scanner;

public class Servidor {

    public static void ConexaoServidor(int porta) {

        // Tenta abrir a porta especificada no método
        try {
            ServerSocket servidor = new ServerSocket(porta);
        }
        // Caso não consiga abrir a porta do sistema para o servidor
        catch (IOException erro) {
            System.out.println("Deu B.O ao criar o socket do server na porta: " + porta);
            System.out.print(erro);
            return;
        }
        System.out.println("Servidor está ouvindo na porta: " + porta);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a porta a ser aberta para o servidor:");
        int ValorPorta = input.nextInt();
        input.close();

        ConexaoServidor(ValorPorta);

    }

}