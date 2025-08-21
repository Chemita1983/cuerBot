import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.events.user.update.UserUpdateOnlineStatusEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class PresenceListener extends ListenerAdapter {

    @Override
    public void onUserUpdateOnlineStatus(@NotNull UserUpdateOnlineStatusEvent event) {
        // Detectar cuando el usuario pasa a estar en línea
        if (event.getMember().getOnlineStatus() == OnlineStatus.ONLINE) {

            String username = event.getMember().getUser().getEffectiveName();

            Objects.requireNonNull(event.getGuild().getDefaultChannel())
                    .asTextChannel()
                    .sendMessage("¡" + username + " ha entrado al servidor! 👋")
                    .queue();
        }
    }
}
