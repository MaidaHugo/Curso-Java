package classe;

// Data padrão 01/01/1970
public class Data {

    Integer dia;
    Integer mes;
    Integer ano;

    Data() {
        // dia = 1;
        // mes = 1;
        // ano = 1970;
        this(1, 1, 1970);
    }

    Data(Integer dia, Integer mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        String diaCom0 = dia.toString();
        String mesCom0 = mes.toString();
        if (dia < 10) {
            diaCom0 = '0' + diaCom0;
        }
        if (mes < 10) {
            mesCom0 = '0' + mesCom0;
        }
        return String.format("%s/%s/%d", diaCom0, mesCom0, ano);
    }

}
