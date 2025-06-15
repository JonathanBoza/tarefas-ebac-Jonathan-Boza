package abstractfactory;

/**
 * Interface para o produto abstractfactory.Car
 */
public interface Car {
    void assembleBody();
    void installEngine();
    void paintExterior();
    String getBrand();
}
