public class Milhar extends Centena{
    private String [] milhares = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private String [] milhares_extenso = {"um mil", "dois mil", "três mil", "quatro mil", "cinco mil", "seis mil", "sete mil", "oito mil", "nove mil"};

    Centena centena = new Centena();
    Caracteres caracteres = new Caracteres();
    public String mostrar_milhar(String numero){
        String resposta = "";
        String sub_num = numero.substring(0, 1);

        for(int i = 0; i < milhares.length; i++){
            if(sub_num.equals(milhares[i])){
                resposta = milhares_extenso[i];
            }
        }

        if(numero.charAt(1) != '0'){
            resposta += " " + centena.mostrar_centena(numero.substring(1, 4));
//            caracteres.deixar_maiusculo(resposta);
        }

        else if(numero.charAt(2) != '0'){
            resposta += " e " + mostrar_dezena(numero.substring(1,3));
//            caracteres.deixar_maiusculo(resposta);
        }
        else if(numero.charAt(3) != '0'){
            resposta += " e " + mostrar_unidade(numero.substring(2,4));
//            caracteres.deixar_maiusculo(resposta);
        }

        return resposta;

    }
    public String[] getMilhares() {
        return milhares;
    }

    public void setMilhares(String[] milhares) {
        this.milhares = milhares;
    }


    public String[] getMilhares_extenso() {
        return milhares_extenso;
    }

    public void setMilhares_extenso(String[] milhares_extenso) {
        this.milhares_extenso = milhares_extenso;
    }


}
