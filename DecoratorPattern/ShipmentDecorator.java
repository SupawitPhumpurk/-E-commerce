package DecoratorPattern;
import FactoryMethodPattern.Shipment;

/**
 * Abstract Decorator สำหรับห่อหุ้ม Shipment
 */
abstract class ShipmentDecorator implements Shipment {
    protected Shipment wrappedShipment;

    public ShipmentDecorator(Shipment wrappedShipment2) {
        this.wrappedShipment = wrappedShipment2;
    }

    @Override
    public String getInfo() {
        return wrappedShipment.getInfo();
    }

    @Override
    public  double getCost() {
        return wrappedShipment.getCost();
    }
}