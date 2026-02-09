public class Smartphone extends Phone implements Camera, Clock{
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void shot() {
        System.out.println("Camera shot...");
    }

    @Override
    public void triggerAlarm() {
        System.out.println("Alarm triggered...");
    }
}
