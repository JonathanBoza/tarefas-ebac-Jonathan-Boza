// Expressão normal (forma tradicional)
interface Calculadora {
    int operacao(int a, int b);
}

// Implementação tradicional
class Soma implements Calculadora {
    @Override
    public int operacao(int a, int b) {
        return a + b;
    }
}

// Uso tradicional
Calculadora calc = new Soma();
int resultado = calc.operacao(5, 3);

// Agora a mesma coisa usando expressão lambda
Calculadora calculadoraLambda = (a, b) -> a + b;
int resultadoLambda = calculadoraLambda.operacao(5, 3);