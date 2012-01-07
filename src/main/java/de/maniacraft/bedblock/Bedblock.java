package de.maniacraft.bedblock;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;

public class Bedblock extends JavaPlugin {
	
	static final Logger log = Logger.getLogger("Minecraft");
	private final BedblockPlayerListener playerListener = new BedblockPlayerListener(this);
	
    public void onDisable() {
        System.out.println(this + " is now disabled!");
    }

    public void onEnable() {           
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Event.Type.PLAYER_BED_ENTER, this.playerListener, Event.Priority.Highest, this);
        System.out.println(this + " is now enabled!");
    }
}
