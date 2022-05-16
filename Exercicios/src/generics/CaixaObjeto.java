package generics;

public class CaixaObjeto {

    private Object coisa;

    public void guardar(Object coisa) {
        this.coisa = coisa;
    }

    public Object abir() {
        return coisa;
    }

}
