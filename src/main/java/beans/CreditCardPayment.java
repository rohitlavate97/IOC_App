package beans;

public class CreditCardPayment implements Ipayment{
    public CreditCardPayment(){
        System.out.println("Credit Card : Constructor");
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("CreditCard Payment successful");
        return true;
    }
}
