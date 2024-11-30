package beans;

public class PaymentService {
    private Ipayment ipayment;
    public PaymentService(){
        System.out.println("PaymentService : zero-param constructor");
    }
    public PaymentService(Ipayment ipayment){
        this.ipayment=ipayment;
        System.out.println("PaymentService : parameterized constructor");
    }
    public void setPayment(Ipayment ipayment){
        System.out.println("Setter method PaymentService called");
        this.ipayment=ipayment;
    }
    public void doPayment(double amount){
        boolean status= ipayment.processPayment(amount);
        if(status){
            System.out.println("Printing receipt");
        }else{
            System.out.println("Cancelling the transfer");
        }
    }
}
