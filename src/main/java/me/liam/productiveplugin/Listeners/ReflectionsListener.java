package me.liam.productiveplugin.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ReflectionsListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage
                (ChatColor.translateAlternateColorCodes('&',
                "\n&7Reflections Worked!"+
                "\nHello, "+player.getName()));
    }
}
