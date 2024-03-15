public class Main {
    public static void main(String[] args) {

        StrategyContext context = new StrategyContext();

        context.setStrategy(new CaesarStrategy(3)); // ese shift es para especificar cuanto se movera en el alfabeto para reemplazar la letra en el que esta al recorrerlo con un for
                                                         // si el caracte res a y el shift es 3 entonces la nueva letra xq la que se reemplaza sera d

        String plaintext = "Thompson";

        context.encryptText(plaintext);

        context.setStrategy(new AStrategy("miClaveSecreta")); // esta wea guardamos un key para ese cifrado o para el cifrado

        context.encryptText(plaintext);

        String aesCiphertext = "APakzuxXCdePTV4B2H1EXw==";

        context.setStrategy(new AStrategy("miClaveSecreta")); //debemos de confirmar la key que guardamos para el cifrado si es erroneo sale un exception xq no es el correcto

        context.decryptText(aesCiphertext);
    }
}
