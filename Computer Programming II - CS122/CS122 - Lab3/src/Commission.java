/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everton
 */
public class Commission extends Hourly {

    private double totalSales;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        totalSales = 0;
    }

    public void setSales(double sales) {
        totalSales += sales;
    }

    @Override
    public double pay() {
        double payment = super.pay() + totalSales * commissionRate;
        totalSales = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        result += "\nCommission Rate: " + commissionRate;
        return result;
    }

}
