package abstractfactory;

/**
 * Implementação concreta do produto abstractfactory.Car do tipo abstractfactory.SUV
 */
public class SUV implements Car {
    private String brand;

    public SUV(String brand) {
        this.brand = brand;
    }

    @Override
    public void assembleBody() {
        System.out.println("Montando carroceria robusta do abstractfactory.SUV " + brand);
    }

    @Override
    public void installEngine() {
        System.out.println("Instalando motor 2.0 turbo no abstractfactory.SUV " + brand);
    }

    @Override
    public void paintExterior() {
        System.out.println("Pintando abstractfactory.SUV " + brand + " com tinta especial");
    }

    @Override
    public String getBrand() {
        return this.brand;
    }
}
