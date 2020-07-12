package pattern.behavioral.state;

/**
 * No state pattern is used, just an if-else statement.
 */
public class TVRemoteNoPatternExample {

    private String state="";

    public void setState(String state){
        this.state=state;
    }

    public void doAction(){
        if(state.equalsIgnoreCase("ON")){
            System.out.println("TV is turned ON");
        }else if(state.equalsIgnoreCase("OFF")){
            System.out.println("TV is turned OFF");
        }
    }

    public static void main(String args[]){
        TVRemoteNoPatternExample remote = new TVRemoteNoPatternExample();

        remote.setState("ON");
        remote.doAction();

        remote.setState("OFF");
        remote.doAction();
    }

}