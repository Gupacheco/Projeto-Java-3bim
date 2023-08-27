public class Unidade {

    private String [] unidades = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private String [] unidades_extenso = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};

    public String mostrar_unidade(String numero){
        for(int i = 0; i < unidades.length; i++){
            if(numero.equals(unidades[i])){
                return unidades_extenso[i];
            }
        }
        return numero;

    }

    public String[] getUnidades_extenso() {
        return unidades_extenso;
    }

    public void setUnidades_extenso(String[] unidades_extenso) {
        this.unidades_extenso = unidades_extenso;
    }

    public String[] getUnidades() {
        return unidades;
    }

    public void setUnidades(String[] unidades) {
        this.unidades = unidades;
    }


}
