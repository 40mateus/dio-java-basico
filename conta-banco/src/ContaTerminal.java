import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       // Conhecer e Importar a classe Scanner 
        // Importa a classe Scanner para permitir a entrada do usuário
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário 
        System.out.println("Bem-vindo ao sistema de criação de contas!");

        // Exibir mensagem solicitando entrada de dados
        System.out.println("Por favor, digite seu nome:");

        // obter pela Scanner os valores digitados no terminal
        // Lê o nome fornecido pelo usuário
        String nome = scanner.nextLine();

        // Exibir mensagem informando que a conta foi criada com sucesso
        System.out.println("Conta criada com sucesso para " + nome + "!");
    }
}
