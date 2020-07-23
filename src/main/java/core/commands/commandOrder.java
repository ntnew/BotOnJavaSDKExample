package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.modules.Reader;
import core.modules.Send;
import vk.VKManager;

public class commandOrder extends Command {
    public commandOrder(String name) {
        super(name);
    }

    private String getStartMessage(){
        String fileName = "C:\\Users\\Ahab\\BotOnJavaSDKExample\\src\\main\\resources\\order.txt";
        return Reader.readTxtFile(fileName);
    }

    @Override
    public void exec(Message message) {
        new VKManager().sendMessage(getStartMessage(), message.getFromId());
    }
}
