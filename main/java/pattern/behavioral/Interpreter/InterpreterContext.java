package pattern.behavioral.Interpreter;

/**
 * Interpreter context class will do the actual interpretation
 */
public class InterpreterContext {

    public String getBinaryFormat(int i){
        return Integer.toBinaryString(i);
    }

    public String getHexadecimalFormat(int i){
        return Integer.toHexString(i);
    }
}
