import java.util.Scanner;

public class NumeroExtenso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            String numero = scan.nextLine();
            int numero2 = Integer.parseInt(numero);
            numero = Integer.toString(numero2);
            if(numero.equals("")){
                break;
            }else{
                Milhar milhar = new Milhar();

                String numero_total = "";

                int tamanho_numero = numero.length();
                if(tamanho_numero == 1 ){
                    numero_total += milhar.mostrar_unidade(numero);
                }
                if(tamanho_numero == 2){
                    numero_total += milhar.mostrar_dezena(numero);
                }
                if(tamanho_numero == 3){
                    numero_total += milhar.mostrar_centena(numero);
                }
                if(tamanho_numero == 4){
                    numero_total += milhar.mostrar_milhar(numero);
                }
                String resp = milhar.caracteres.deixar_maiusculo(numero_total);
                System.out.println(resp);
            }
            }

        }


    }

