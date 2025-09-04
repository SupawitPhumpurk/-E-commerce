package FactoryMethodPattern;

/**
 * Interface (Product) สำหรับสร้างอ็อบเจกต์ Shipment
 */
public class ShipmentFactory {
   public Shipment createShipment(String type) {
    if ("STANDARD".equalsIgnoreCase(type)) {
        return new StandardShipment();
    } else if ("EXPRESS".equalsIgnoreCase(type)) {
        return new ExpressShipment();
    }
    throw new IllegalAccessError("Unknow shipment type: " + type);
   }
}