
import App.ClientReceiver;
import App.ClientSender;
import Commands.*;
import Controller.Commandable;
import Controller.Commands;
import Ticket.TicketCollection;
import Utility.ScriptException;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.Scanner;

//    execute_script C:\Users\Diana\Desktop\script.txt
public class main {
    public static void main(String[] args) throws IOException {
        ClientSender clientSender = new ClientSender(35259);
        ClientReceiver receiver = new ClientReceiver(clientSender);
        TicketCollection tickets = new TicketCollection();
        tickets.setDateOFCreation(java.time.ZonedDateTime.now());
        Commands commands = new Commands();
        Scanner in = new Scanner(System.in);
        commands.regist(new Print_field_descending_type(), new Clear(), new Filter_starts_with_name(), new Show(), new Replace_if_lower(), new Exit(), new Update(), new Remove_lower_key(), new Help(), new Info(),
                new Print_ascending(), new Execute_script(), new Insert(), new Remove_key(), new Replace_if_greater());
        while (true) {
            System.out.print("$ ");
            String commandName = in.nextLine();
            if (!commandName.equals("")) {
                if (commands.getCommand(commandName.split(" ")[0]) != null) {
                    try {
                        Map<Commandable, String> map = commands.executeCommand(commandName);
                        if (map != null) {
                            ClientSender.connect();
                            clientSender.send(map);
                            if (Commands.timeTostop) {
                                System.out.println("Коллекция сохранена.");
                                System.exit(0);
                            }
                            System.out.println(receiver.receive());
                            ClientSender.socketChannel.close();
                        }

                    } catch (SocketTimeoutException | InterruptedException | ClassNotFoundException | ScriptException e) {
                        System.out.println("Cервер занят другим пользователем, подождите пожалуйста и попробуйте снова.");
                    }
                } else System.out.println("Такой команды не существует, введите help.");
            }
        }
    }
}
