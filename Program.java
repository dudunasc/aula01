package application;

import services.DeliverService;
import services.PayService;
import services.TaxService;

public class Program {
    public static void main(String[] args) {
        TaxService taxService = new taxService();
        DeliverService deliverService = new deliverService();

        PayService payService = new payService(taxService, deliverService);

        System.out.println("Valor a ser pago = " + payService.finalPrice(300.00, "SC"));
    }
}