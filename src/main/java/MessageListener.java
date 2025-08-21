import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class MessageListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (event.getAuthor().isBot()) return;

        String mensaje = event.getMessage().getContentRaw();

        if (mensaje.equalsIgnoreCase("hola")) {
            event.getChannel().sendMessage("¡Hola, " + event.getAuthor().getEffectiveName() + "!").queue();
        }
    }
}
