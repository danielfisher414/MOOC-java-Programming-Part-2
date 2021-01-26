
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danie
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ArrayList<Double> historyList;

//    private double initialBalance;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);

        this.historyList = new ArrayList<>();
        this.historyList.add(initialBalance);
    }

    public String history() {
        String num = this.historyList.toString();
        return num;
    }

    public void addToWarehouse(double amount) {
        double total = 0;

        super.addToWarehouse(amount);
        total = amount + this.historyList.get(this.historyList.size() - 1);
        this.historyList.add(total);

    }

    public double takeFromWarehouse(double amount) {
        double balance = this.historyList.get(this.historyList.size() - 1);
        double result = 0;
        if (amount < 0) {
            return 0.0;
        }
        if (amount > balance) {
            double allThatWeCan = balance;
            balance = 0.0;
            return allThatWeCan;
        }
        double sum = super.takeFromWarehouse(amount);

        double historyNum = this.historyList.get(this.historyList.size() - 1);

//        System.out.println(this.historyList.size());
        result = historyNum - sum;

        this.historyList.add(result);

        return result;

    }

    public void printAnalysis() {
        double total;
        double sum = 0;
        double count = 0;

        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        double doublesSum = 0;
        if (this.historyList.isEmpty()) {
            doublesSum=0;
        } else {
            for (Double value : historyList) {

                if (value > doublesSum) {
                    doublesSum = value;
                }
            }

        }
        System.out.println("Largest amount of product: " + doublesSum);

        double firstNum = this.historyList.get(0);
        if (this.historyList.size() == 1) {
            System.out.println(this.historyList.get(0));
        }
        for (Double value : this.historyList) {

            if (firstNum > value) {
                firstNum = value;
            }
        }
        System.out.println("Smallest amount of product: " + firstNum);

        for (Double value : this.historyList) {
            sum += value;
            count++;
        }
        total = sum / count;
        System.out.println("Average: " + total);
    }

}
