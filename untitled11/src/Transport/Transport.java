package Transport;
import java.util.Objects;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;
    private boolean diagnostic;

    public Transport(String brand, String model, double engineVolume, boolean diagnostic) {
        if (brand != null || !brand.isEmpty() || !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null || !model.isEmpty() || !model.isBlank()) {
            this.model = model;
        }
        if (engineVolume < 0) {
            this.engineVolume = engineVolume;
        }
        this.diagnostic = diagnostic;
    }

    public boolean makeDiagnostic() {
        if (!diagnostic) {
            diagnostic = true;
            System.out.println("Производим диагностику");
        }
        return true;
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", Модель: " + model + ", Объем двигателя: " + engineVolume +". Диагностика: " + makeDiagnostic();

    }

    public abstract void startMoving();
    public abstract void finishTheMove();
    public abstract void printType();
    public abstract void passDiagnostics();
    public void checkDiagnostic() {
        if (diagnostic) {
            System.out.println("Необходима диагностика");
        } else {
            System.out.println("Диагностика не требуется");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null || !brand.isEmpty() || !brand.isBlank()) {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null || !model.isEmpty() || !model.isBlank()) {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0|| !model.isEmpty() || !model.isBlank()) {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand)
                && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }
}