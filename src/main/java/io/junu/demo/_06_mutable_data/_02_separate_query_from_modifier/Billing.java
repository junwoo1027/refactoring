package io.junu.demo._06_mutable_data._02_separate_query_from_modifier;

public class Billing {

    private Customer customer;

    private EmailGateway emailGateway;

    public Billing(Customer customer, EmailGateway emailGateway) {
        this.customer = customer;
        this.emailGateway = emailGateway;
    }

    public double totalOutstanding() {
        double result = customer.getInvoices().stream()
                .map(Invoice::getAmount)
                .reduce((double) 0, Double::sum);
        return result;
    }

    public void sendBill() {
        emailGateway.send(formatBill(customer));
    }

    private String formatBill(Customer customer) {
        return "sending bill for " + customer.getName();
    }
}
