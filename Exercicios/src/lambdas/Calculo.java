package lambdas;

@FunctionalInterface // * Define que essa interface é uma interface funcional
public interface Calculo {

    double executar(double a, double b);

    default String legal() {
        return "legal";
    }

    static String massa() {
        return "muito legal";
    }

}
