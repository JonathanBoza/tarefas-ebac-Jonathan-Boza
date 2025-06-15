package abstractfactory;

/**
 * Implementação concreta do produto abstractfactory.Car do tipo abstractfactory.Sedan
 */
public class Sedan implements Car {
    private String brand;

    public Sedan(String brand) {
        this.brand = brand;
    }

    @Override
    public void assembleBody() {
        System.out.println("Montando carroceria do abstractfactory.Sedan " + brand);
    }

    @Override
    public void installEngine() {
        System.out.println("Instalando motor 1.6 no abstractfactory.Sedan " + brand);
    }

    @Override
    public void paintExterior() {
        System.out.println("Pintando abstractfactory.Sedan " + brand);
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
