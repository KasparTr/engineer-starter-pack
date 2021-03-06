package pattern.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd){
        if("Kaspar".equals(user) && "Password123".equals(pwd)) isAdmin=true;
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin){
            executor.runCommand(cmd);
        }else{
            if(cmd.trim().startsWith("sudo")){
                throw new Exception("sudo command is not allowed for non-admin users.");
            }else{
                executor.runCommand(cmd);
            }
        }
    }

}