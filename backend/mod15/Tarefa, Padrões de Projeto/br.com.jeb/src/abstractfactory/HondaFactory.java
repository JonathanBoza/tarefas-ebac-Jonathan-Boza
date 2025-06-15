package abstractfactory;

/**
 * Implementação concreta de fábrica para carros Honda
 */
public class HondaFactory implements CarFactory {
    @Override
    public Car createSedan() {
        return new Sedan("Honda");
    }

    @Override
    public Car createSUV() {
        return new SUV("Honda");
    }
}
