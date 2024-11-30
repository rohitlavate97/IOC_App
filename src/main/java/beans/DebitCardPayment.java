package beans;

public class DebitCardPayment implements Ipayment{
    public DebitCardPayment(){
        System.out.println("Debit Card : Constructor");
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("DebitCard payment successful");
        return true;
    }
}
