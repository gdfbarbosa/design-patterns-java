package io.gdfbarbosa.patterns.behavioral.state;

/**
 * Demo class. Everything comes together here.
 */
public class StateClient {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}