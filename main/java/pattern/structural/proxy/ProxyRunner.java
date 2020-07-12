package pattern.structural.proxy;

public class ProxyRunner {
    public static void main(String[] args){
        CommandExecutor sudoExecutor = new CommandExecutorProxy("Kaspar", "Password123");
        CommandExecutor executor = new CommandExecutorProxy("Kaspar", "wrongPass");

        try {
            sudoExecutor.runCommand("ls -ltr");
            sudoExecutor.runCommand(" sudo rm -rf abc.pdf");
            executor.runCommand(" sudo rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }
}
