package objects;

public class Player {
    public String pedra() {
        System.out.println("Voce escolheu Pedra");
        return "pedra";
    }

    public String papel() {
        System.out.println("Voce escolheu Papel");
        return "papel";
    }

    public String tesoura() {
        System.out.println("Voce escolheu Tesoura");
        return "tesoura";
    }
}
