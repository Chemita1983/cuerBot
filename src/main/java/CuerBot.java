import net.dv8tion.jda.api.JDABuilder;

public class CuerBot {

    public static void main(String[] args) {
        String token = "";
        JDABuilder.createDefault(token)
                .addEventListeners(new VoiceJoinListener())
                .build();
    }
}