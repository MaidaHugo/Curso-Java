package fundamentos.conversao;

public class ConversaoTiposPrimitivos {

    public static void main(String[] args) {

        double a = 1; // *Conversão implícita
        System.out.println(a);

        float b = (float) 1.12345678888; // *Conversão explícita (Cast)
        System.out.println(b);

        double x = 1.123456788888;
        System.out.println(x);

        int c = 130;
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.999999;
        int f = (int) e; // * Neste caso vai ter perda de valor, o Java vai ignorar a parte decimal
        System.out.println(f);

    }

}
