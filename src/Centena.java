import java.util.Scanner;
public class Centena extends Dezena{
    private String [] centenas = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private String [] centenas_extenso = {"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seissentos", "setecentos", "oitocentos", "novecentos"};
    public String mostrar_centena(String numero){
        String resposta = "";
        String sub_num = numero.substring(0, 1);

        if(numero.equals("100")){
            return "Cem";
        }

        for(int i = 0; i < centenas.length; i++){
            if(sub_num.equals(centenas[i])){
                resposta = centenas_extenso[i];
            }
        }

        if(numero.charAt(1) != '0'){
            resposta += " e " + mostrar_dezena(numero.substring(1,3));
        }
        else if(numero.charAt(2) != '0'){
            resposta += " e " + mostrar_unidade(numero.substring(2,3));
        }

        return resposta;
    }
    public String[] getCentenas() {
        return centenas;
    }

    public void setCentenas(String[] centenas) {
        this.centenas = centenas;
    }

    public String[] getCentenas_extenso() {
        return centenas_extenso;
    }

    public void setCentenas_extenso(String[] centenas_extenso) {
        this.centenas_extenso = centenas_extenso;
    }
}


