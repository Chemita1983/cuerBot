
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.voice.GuildVoiceUpdateEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class VoiceJoinListener extends ListenerAdapter {

    @Override
    public void onGuildVoiceUpdate(@NotNull GuildVoiceUpdateEvent event) {
        String userName = event.getMember().getEffectiveName();
        String voiceChannelName = event.getChannelJoined().getName();

        // Encuentra un canal de texto para enviar el mensaje
        TextChannel textChannel = Objects.requireNonNull(event.getGuild().getDefaultChannel()).asTextChannel();  // Canal de texto predeterminado

        // Verifica si el canal es de tipo TextChannel
        textChannel.sendMessage(
                "Hola " + userName + ", soy cuerBot, bienvenido al canal **" + voiceChannelName + "**, pórtate bien."
        ).queue();
    }
}