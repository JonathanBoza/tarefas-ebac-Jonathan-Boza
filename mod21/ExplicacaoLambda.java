interface Calculadora {
    int operacao(int a, int b);
}

class Soma implements Calculadora {
    @Override
    public int operacao(int a, int b) {
        return a + b;
    }
}

Calculadora calc = new Soma();
int resultado = calc.operacao(5, 3);

Calculadora calculadoraLambda = (a, b) -> a + b;
int resultadoLambda = calculadoraLambda.operacao(5, 3);