package necode.angelitex.tiplur.angeltextapi.tools.ActionBar;

import necode.angelitex.tiplur.angeltextapi.tools.Color.ColorUtil;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;

public class ActionBar {
    /**
     * Created by TIplur 06.04.2022
     */
    /**
     * @param player a player to show the text to.
     * @param message the message of the action bar.
     */
    public void sendActionBar(Player player, String message) {
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ColorUtil.MultiColor(message)));
    }
}
