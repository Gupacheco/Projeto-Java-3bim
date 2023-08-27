public class Caracteres {
    private String resposta_maiscula;
    private int tamanho;
    public String deixar_maiusculo(String resposta){
        this.resposta_maiscula = resposta.substring(0,1).toUpperCase();
        this.tamanho = resposta.length();
        return this.resposta_maiscula + resposta.substring(1, this.tamanho);
    }
    public String getResposta_maiscula() {
        return resposta_maiscula;
    }

    public void setResposta_maiscula(String resposta_maiscula) {
        this.resposta_maiscula = resposta_maiscula;
    }


    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }


}
