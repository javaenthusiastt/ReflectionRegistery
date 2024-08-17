package me.liam.productiveplugin.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ReflectionsListenerTwo implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        player.sendMessage
                (ChatColor.translateAlternateColorCodes('&',
                        "\n&7Reflections Worked!"+
                                "\nNice chat!\n"));
    }
}
