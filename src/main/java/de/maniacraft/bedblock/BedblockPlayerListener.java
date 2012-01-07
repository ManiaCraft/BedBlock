package de.maniacraft.bedblock;

import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerListener;

public class BedblockPlayerListener extends PlayerListener
{
  public Bedblock plugin;
  private String kickmessage = "Je laenger man schlaeft, je weniger man lebt.";
  public BedblockPlayerListener(Bedblock instance)
  {
    this.plugin = instance;
  }

  public void onPlayerBedEnter(PlayerBedEnterEvent event)
  {
    Player player = event.getPlayer();
    event.setCancelled(true);
    player.sendMessage(ChatColor.BLUE + kickmessage);
  }

}