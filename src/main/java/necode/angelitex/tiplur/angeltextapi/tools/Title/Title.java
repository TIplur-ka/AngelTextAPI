package necode.angelitex.tiplur.angeltextapi.tools.Title;

import org.bukkit.entity.Player;

public class Title {
    /**
     * Created by TIplur 06.04.2022
     */

    /**
     * @param p a player to show the text to.
     * @param fadeIn the time the title should fade in.
     * @param stay how long should the title last
     * @param fadeOut the time the title should fade out.
     * @param title the title to show to the player.
     * @param subtitle the smaller message below the title.
     */
    public static void sendTitle(Player p, Integer fadeIn, Integer stay, Integer fadeOut, String title, String subtitle) {
        p.sendTitle(title, subtitle, fadeIn, stay, fadeOut);
    }

    /**
     * @param player a player to show the text to.
     * @param title the title to show to the player.
     * @param subTitle the smaller message below the title.
     */
    public static void showText(Player player, String title, String subTitle){
        Title.sendTitle(player, 12, 25, 12, title, subTitle);
    }

    /**
     * @param player a player to show the text to.
     * @param title the title to show to the player.
     * @param subTitle the smaller message below the title.
     * @param seconds the time the title should be shown.
     */
    public static void showText(Player player, String title, String subTitle, int seconds){
        Title.sendTitle(player, 0, seconds, 0, title, subTitle);
    }

    /**
     * @param player a player to show the text to.
     * @param title the title to show to the player.
     * @param subTitle the smaller message below the title.
     * @param seconds the time the title should be shown.
     * @param fade the time the title should fade in/out.
     */
    public static void showText(Player player, String title, String subTitle, int seconds, int fade){
        Title.sendTitle(player, fade, seconds, fade, title, subTitle);
    }

    /**
     * @param player a player to show the text to.
     * @param title the title to show to the player.
     * @param subTitle the smaller message below the title.
     * @param seconds the time the title should be shown.
     * @param fadeIn the time the title should fade in.
     * @param fadeOut the time the title should fade out.
     */
    public static void showText(Player player, String title, String subTitle, int seconds, int fadeIn, int fadeOut){
        Title.sendTitle(player, fadeIn, seconds, fadeOut, title, subTitle);
    }

    /**
     * @param player a player to clear the shown title.
     */
    public static void clearText(Player player){
        Title.sendTitle(player, 0, 0, 0, "", "");
    }

    /**
     * @param player a player to show the tablist.
     * @param header a text shown above the tablist.
     * @param footer a text shown below the tablist.
     */
    public static void setTablistTitle(Player player, String[] header, String[] footer){
        String head = "";
        String foot = "";
        for (String s:header) {
            head = s + "\n";
        }
        for (String s:footer) {
            foot = s + "\n";
        }
        player.setPlayerListHeaderFooter(head, foot);
    }

    /**
     * @param player a player to reset the tablist from.
     */
    public static void removeTablist(Player player){
        player.setPlayerListHeaderFooter("", "");
    }

    /**
     * @param player a player to set ChatName, TablistName and DisplayName.
     * @param name the name the player will receive.
     */
    public static void setName(Player player, String name){
        setChatName(player, name);
        setTablistName(player, name);
        setDisplayName(player, name);
    }

    /**
     * @param player a player to set TablistName.
     * @param name the name the player will receive.
     */
    public static void setTablistName(Player player, String name){
        player.setPlayerListName(name);
    }

    /**
     * @param player a player to set ChatName.
     * @param name the name the player will receive.
     */
    public static void setChatName(Player player, String name){
        player.setDisplayName(name);
    }

    /**
     * @param player a player to set DisplayName.
     * @param name the name the player will receive.
     */
    public static void setDisplayName(Player player, String name){
        player.setDisplayName(name);
    }
}
