package iphone;

import Calls.AparelhoTelefonico;
import Internet.NavegadorInternet;
import Music.ReprodutorMusical;

public class Iphone{
    public static void main(String[] args) {
        AparelhoTelefonico tel = new AparelhoTelefonico();

        tel.ligar("67 99249-2794");
        tel.atender();
        tel.iniciarCorreioVoz();

        ReprodutorMusical rep = new ReprodutorMusical();

        rep.selecionarMusica("Smoke on the water");
        rep.tocar();
        rep.pausar();

        NavegadorInternet nav = new NavegadorInternet();

        nav.exibirPagina("Youtube.com");
        nav.atualizarPagina();
        nav.adicionarNovaAba();
    }

}