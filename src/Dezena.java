public class Dezena extends Unidade{
    private String [] unidades_esp = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private String [] dezenas_extenso = {"dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};

    private String [] dezenas_esp = {"11", "12", "13", "14", "15", "16", "17", "18", "19"};
    private String [] dezenas_esp_str = {"onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};

    Caracteres caracteres = new Caracteres();
    public String mostrar_dezena(String numero){
        String resposta = "";
        String sub_num = numero.substring(0, 1);
        for(int i = 0; i < unidades_esp.length; i++){
             if (numero.equals(dezenas_esp[i])) {
                return dezenas_esp_str[i];
            }
            else if(sub_num.equals(unidades_esp[i])){
                resposta = dezenas_extenso[i];
            }
        }
        if(numero.charAt(1) != '0'){
            resposta += " e " + mostrar_unidade(numero.substring(1,2));
        }
        return resposta;
    }


    public String[] getDezenas_esp_str() {
        return dezenas_esp_str;
    }

    public void setDezenas_esp_str(String[] dezenas_esp_str) {
        this.dezenas_esp_str = dezenas_esp_str;
    }

    public String[] getDezenas_esp() {
        return dezenas_esp;
    }

    public void setDezenas_esp(String[] dezenas_esp) {
        this.dezenas_esp = dezenas_esp;
    }

    public String[] getDezenas_extenso() {
        return dezenas_extenso;
    }

    public void setDezenas_extenso(String[] dezenas_extenso) {
        this.dezenas_extenso = dezenas_extenso;
    }

    public String[] getUnidades_esp() {
        return unidades_esp;
    }

    public void setUnidades_esp(String[] unidades_esp) {
        this.unidades_esp = unidades_esp;
    }


}
