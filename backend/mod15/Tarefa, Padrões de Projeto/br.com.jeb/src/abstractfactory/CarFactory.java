package abstractfactory;
/**
 * Interface para a fábrica abstrata de carros
 */
public interface CarFactory {
    Car createSedan();
    Car createSUV();
}
