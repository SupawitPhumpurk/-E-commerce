package StrategyPattern;
import DataModels.Order;

public class FixedDiscount implements DiscountStrategy {
    private final double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double applyDiscount(Order Order) {
        return Math.max(0, Order.getTotalPrice() - amount);
    }
}