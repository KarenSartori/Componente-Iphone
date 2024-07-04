public class Iphone {

    private ReprodutorMusical reprodutor;
    private AparelhoTelefonico telefone;
    private NavegadorInternet navegador;

    public Iphone(ReprodutorMusical reprodutor, AparelhoTelefonico telefone, NavegadorInternet navegador) {
        this.reprodutor = reprodutor;
        this.telefone = telefone;
        this.navegador = navegador;
    }

    public void tocarMusica() {
        reprodutor.tocar();
    }

    public void pausarMusica() {
        reprodutor.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutor.selecionarMusica(musica);
    }

    public void ligarPara(String numero) {
        telefone.ligar(numero);
    }

    public void atenderChamada() {
        telefone.atender();
    }

    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    public void exibirPaginaWeb(String url) {
        navegador.exibirPagina(url);
    }

    public void adicionarAba() {
        navegador.adicionarNovaAba();
    }

    public void atualizarPaginaWeb() {
        navegador.atualizarPagina();
    }
}