package core;

import core.commands.*;
import core.modules.Reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;


public class CommandManager {
    private static HashSet<Command> commands = new HashSet<>();

    static {

        commands.add(new Begin(getDesc("C:\\Users\\Ahab\\BotOnJavaSDKExample\\src\\main\\resources\\cStart.txt")));

        commands.add(new Sale(getDesc("C:\\Users\\Ahab\\BotOnJavaSDKExample\\src\\main\\resources\\cSale.txt")));

        commands.add(new commandOrder(getDesc("C:\\Users\\Ahab\\BotOnJavaSDKExample\\src\\main\\resources\\cOrder.txt")));

        commands.add(new orderPizza(getDesc("C:\\Users\\Ahab\\BotOnJavaSDKExample\\src\\main\\resources\\cDeliver.txt")));

    }

    public static HashSet<Command> getCommands(){
        return commands;
    }
    public static void addCommand(Command command) { commands.add(command);}
    private static String getDesc(String fileName){
        String s = "";

        try {
            s = Files.lines(Paths.get(fileName)).reduce("", String::concat);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
