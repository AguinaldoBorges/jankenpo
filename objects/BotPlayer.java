package objects;

public class BotPlayer {
    public String escolher() {
        double numeroAleatorioDouble = (Math.random() * 3) + 1;
        int numeroAleatorioInt = (int) numeroAleatorioDouble;
        switch (numeroAleatorioInt) {
            case 1:
                return "pedra";
            case 2:
                return "papel";
            case 3:
                return "tesoura";
            default:
                return "pedra";
        }
    }
}
