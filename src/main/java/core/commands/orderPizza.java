package core.commands;

import com.vk.api.sdk.objects.messages.Message;
import core.Command;
import core.modules.Reader;
import core.modules.Send;
import vk.VKManager;

public class orderPizza extends Command {
    public orderPizza(String name) {
        super(name);
    }

    private String getStartMessage(){
        String fileName = "C:\\Users\\Ahab\\BotOnJavaSDKExample\\src\\main\\resources\\startPage.txt";
        return Reader.readTxtFile(fileName);
    }

    @Override
    public void exec(Message message) {
        String filename = "C:\\Users\\Ahab\\BotOnJavaSDKExample\\src\\main\\resources\\keyboardPizza.json";
        //new VKManager().sendMessage(getStartMessage(), message.getUserId());
        new Send().sendKeyboard(filename, message.getFromId());

    }
}
