class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device id: " + deviceId);
        System.out.println("Stauts: " + status);
    }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temp settin: " + temperatureSetting + "°C");
    }
}

public class Smart_Home {
    public static void main(String[] args) {
        Device device = new Device("D123", "ON");
        Thermostat thermo = new Thermostat("T456", "OFF", 22.5);

        System.out.println("--- Device Status ---");
        device.displayStatus();

        System.out.println("\n--- Thermostat Stauts ---");
        thermo.displayStatus();
    }
}
