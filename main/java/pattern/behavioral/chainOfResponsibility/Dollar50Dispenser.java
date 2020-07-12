package pattern.behavioral.chainOfResponsibility;

public class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount() < 50) this.chain.dispense(cur);   //pass down the chain if lower than 50
        else {
            int num = cur.getAmount()/50;   // how many full $50 notes can be dispensed.
            int remainder = cur.getAmount() % 50;
            System.out.println("remainder:" + remainder);
            System.out.println("Dispensing "+num+" 50$ note");
            if(remainder !=0) this.chain.dispense(new Currency(remainder));
        }
    }

}