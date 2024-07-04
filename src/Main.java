public class Main {

    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();

        Iphone iphone = new Iphone(reprodutor, telefone, navegador);

        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica("Iris");

        iphone.ligarPara("11999995555");
        iphone.atenderChamada();
        iphone.iniciarCorreioVoz();

        iphone.exibirPaginaWeb("www.exemplo.com");
        iphone.adicionarAba();
        iphone.atualizarPaginaWeb();
    }
}
