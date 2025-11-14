package com.cfs.designpattern;



public class StrategyDesign {

    public interface PaymentStartegy {
        public void pay();
    }

    public static class CreditCard implements PaymentStartegy {
        @Override
        public void pay() {
            System.out.println("Payment CC");
        }
    }

    public static class UPI implements PaymentStartegy {
        @Override
        public void pay() {
            System.out.println("Payment UPI");
        }
    }

    public static class PaymentProcess{
        private PaymentStartegy paymentStartegy;
        public PaymentProcess(PaymentStartegy paymentStartegy) {
            this.paymentStartegy = paymentStartegy;
        }

        public void processPayment(){
            paymentStartegy.pay();
        }

    }

    public static void main(String[] args) {
        PaymentStartegy credit = new CreditCard();
        PaymentProcess paymentProcess = new PaymentProcess(credit);
        paymentProcess.processPayment();
    }

}


