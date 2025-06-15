package abstractfactory;

/**
 * Classe de demonstração do padrão Abstract Factory
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("=== Produção de carros Toyota ===");
        CarFactory toyotaFactory = new ToyotaFactory();

        // Criando um sedan Toyota
        Car toyotaSedan = toyotaFactory.createSedan();
        System.out.println("Produzindo " + toyotaSedan.getBrand() + " abstractfactory.Sedan");
        toyotaSedan.assembleBody();
        toyotaSedan.installEngine();
        toyotaSedan.paintExterior();
        System.out.println();

        // Criando um abstractfactory.SUV Toyota
        Car toyotaSUV = toyotaFactory.createSUV();
        System.out.println("Produzindo " + toyotaSUV.getBrand() + " abstractfactory.SUV");
        toyotaSUV.assembleBody();
        toyotaSUV.installEngine();
        toyotaSUV.paintExterior();
        System.out.println();

        System.out.println("=== Produção de carros Honda ===");
        CarFactory hondaFactory = new HondaFactory();

        // Criando um sedan Honda
        Car hondaSedan = hondaFactory.createSedan();
        System.out.println("Produzindo " + hondaSedan.getBrand() + " abstractfactory.Sedan");
        hondaSedan.assembleBody();
        hondaSedan.installEngine();
        hondaSedan.paintExterior();
        System.out.println();

        // Criando um abstractfactory.SUV Honda
        Car hondaSUV = hondaFactory.createSUV();
        System.out.println("Produzindo " + hondaSUV.getBrand() + " abstractfactory.SUV");
        hondaSUV.assembleBody();
        hondaSUV.installEngine();
        hondaSUV.paintExterior();
    }
}
