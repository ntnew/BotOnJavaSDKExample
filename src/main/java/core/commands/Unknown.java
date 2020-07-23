package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.modules.Reader;
import vk.VKManager;

/**
 * @author Arthur Kupriyanov
 */
public class Unknown extends Command {

    public Unknown(String name) {
        super(name);
    }

    private String getStartMessage(){
        String fileName = "C:\\Users\\Ahab\\BotOnJavaSDKExample\\src\\main\\resources\\UnknownMsg.txt";
        return Reader.readTxtFile(fileName);
    }

    @Override
    public void exec(Message message) {
        new VKManager().sendUnknownMessage(getStartMessage(), message.getFromId());
    }
}
