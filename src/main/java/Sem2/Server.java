package Sem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Server implements Clickable {
    boolean isConnect;
    Listenerable action;
    StringBuilder textLog;
    private static final String fileName = "./src/seminar02/clientchat/log_chat.txt";


    public Server(Listenerable action) {
        this.isConnect = false;
        this.action = action;
    }

    @Override
    public void sendMessage(String textMsg) {
        textLog.append("- ").append(textMsg).append("\n");
        action.buttonAction(textLog.toString());
    }

    @Override
    public void login(String login, String password) {
        textLog = new StringBuilder("Login is correct!").append("\n\n");
        try (BufferedReader br = new BufferedReader(
                new FileReader(Server.fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                textLog.append(line).append("\n");
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        action.buttonAction(textLog.toString());
    }

    @Override
    public void disconnect() {
        try (FileWriter fw = new FileWriter(Server.fileName, false)) {
            fw.write(textLog.toString());
            fw.flush();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
