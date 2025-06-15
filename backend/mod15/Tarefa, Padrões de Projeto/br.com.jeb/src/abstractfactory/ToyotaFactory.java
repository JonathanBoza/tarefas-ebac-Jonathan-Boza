package abstractfactory;

/**
 * Implementação concreta de fábrica para carros Toyota
 */
public class ToyotaFactory implements CarFactory {
    @Override
    public Car createSedan() {
        return new Sedan("Toyota");
    }

    @Override
    public Car createSUV() {
        return new SUV("Toyota");
    }
}
