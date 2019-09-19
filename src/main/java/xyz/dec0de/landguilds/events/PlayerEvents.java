package xyz.dec0de.landguilds.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import xyz.dec0de.landguilds.storage.PlayerStorage;

import java.io.IOException;

public class PlayerEvents implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) throws IOException {
        Player player = e.getPlayer();

        PlayerStorage playerStorage = new PlayerStorage(player);
    }
}