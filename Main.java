import objects.Player;
import objects.BotPlayer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int playerPoints = 0, botPoints = 0, playerNumber = 1;
        String playerChoose = "pedra", botChoose = "tesoura";

        Player player = new Player();
        BotPlayer botPlayer = new BotPlayer();

        Scanner scanner = new Scanner(System.in);

        System.out.println("____________________");
        System.out.println("");
        System.out.println("Jan Ken Po");
        System.out.println("____________________");
        System.out.println("");

        inicio: while (botPoints < 3 && playerPoints < 3) {
            System.out.println("____________________");
            System.out.println("Digite um número de 1 a 3 para fazer sua jogada.");
            System.out.println("1 = Pedra, 2 = Papel e 3 = Tesoura: ");
            playerNumber = scanner.nextInt();

            if (playerNumber == 1) {
                playerChoose = player.pedra();
            } else if (playerNumber == 2) {
                playerChoose = player.papel();
            } else if (playerNumber == 3) {
                playerChoose = player.tesoura();
            } else {
                System.out.println("Número inválido.");
                continue inicio;
            }

            System.out.println("Aguardando a jogada do oponente...");
            botChoose = botPlayer.escolher();

            System.out.println("");
            System.out.println("Você: " + playerChoose + " | Oponente: " + botChoose);
            System.out.println("");

            switch (playerChoose) {
                case "pedra":
                    switch (botChoose) {
                        case "pedra":
                            System.out.println("EMPATE");
                            break;
                        case "papel":
                            botPoints++;
                            System.out.println("PERDEU");
                            break;
                        case "tesoura":
                            playerPoints++;
                            System.out.println("GANHOU");
                            break;
                        default:
                            break;
                    }
                    break;
                case "papel":
                    switch (botChoose) {
                        case "pedra":
                            playerPoints++;
                            System.out.println("GANHOU");
                            break;
                        case "papel":
                            System.out.println("EMPATE");
                            break;
                        case "tesoura":
                            botPoints++;
                            System.out.println("PERDEU");
                            break;
                        default:
                            break;
                    }
                    break;
                case "tesoura":
                    switch (botChoose) {
                        case "pedra":
                            botPoints++;
                            System.out.println("PERDEU");
                            break;
                        case "papel":
                            playerPoints++;
                            System.out.println("GANHOU");
                            break;
                        case "tesoura":
                            System.out.println("EMPATE");
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }

            System.out.println("*Placar: " + playerPoints + " a " + botPoints);
        }

        scanner.close(); // Fechando o Scanner após terminar de usar
        System.out.println("");
        System.out.println("____________________");
        if (playerPoints == 3) {
            System.out.println("Uhuuuu! Você GANHOU! Parabéns! :)");

        } else if (botPoints == 3) {
            System.out.println("Que pena, você PERDEU! :(");
        }
    }
}
