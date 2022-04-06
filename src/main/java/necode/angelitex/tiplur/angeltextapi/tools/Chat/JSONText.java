package necode.angelitex.tiplur.angeltextapi.tools.Chat;

import necode.angelitex.tiplur.angeltextapi.tools.Color.ColorUtil;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class JSONText {
    /**
     * Created by TIplur 06.04.2022
     */

    /**
     * @param string the string of the JSON text.
     * @param hoverMessage the hover message of the JSON text.
     * @param actionText the action of the JSON text.
     * @param type the type action of the JSON text.
     */
    public static TextComponent createInteractiveMessage(String string, String hoverMessage, String actionText, JSONText.MessageType type) {
        TextComponent textComponent = new TextComponent(ColorUtil.setColor(string));
        if (!hoverMessage.equals("")) {
            textComponent.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, (new ComponentBuilder(ColorUtil.setColor(hoverMessage))).create()));
        }

        if (!actionText.equals("")) {
            switch(type) {
                case SUGGEST:
                    textComponent.setClickEvent(new ClickEvent(net.md_5.bungee.api.chat.ClickEvent.Action.SUGGEST_COMMAND, actionText));
                    break;
                case COMMAND:
                    textComponent.setClickEvent(new ClickEvent(net.md_5.bungee.api.chat.ClickEvent.Action.RUN_COMMAND, actionText));
                    break;
                case LINK:
                    textComponent.setClickEvent(new ClickEvent(net.md_5.bungee.api.chat.ClickEvent.Action.OPEN_URL, actionText));
            }
        }

        return textComponent;
    }

    /**
     * @param string the string of the JSON text.
     * @param hoverMessage the hover message of the JSON text.
     */
    public static TextComponent createInteractiveMessage(String string, String hoverMessage) {
        TextComponent textComponent = new TextComponent(ColorUtil.setColor(string));
        if (!hoverMessage.equals("")) {
            textComponent.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, (new ComponentBuilder(ColorUtil.setColor(hoverMessage))).create()));
        }
        return textComponent;
    }

    public static enum MessageType {
        SUGGEST,
        COMMAND,
        LINK;

        private MessageType() {
        }
    }
}
