package StrategyPattern;
import DataModels.Order;

/**
 *  Interface สำหรับกลยุทธ์ส่วนลด
 */
public interface DiscountStrategy {
    double applyDiscount(Order Order);
}