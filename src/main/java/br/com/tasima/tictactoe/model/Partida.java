package br.com.tasima.tictactoe.model;

public class Partida {
    private String id;
    private Jogador jogadorZero;
    private Jogador jogadorUm;
    private Tabuleiro tabuleiro;

    public Partida(String id) {
        this.id = id;
        this.tabuleiro = new Tabuleiro();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Jogador getJogadorZero() {
        return jogadorZero;
    }

    public void setJogadorZero(Jogador jogadorZero) {
        this.jogadorZero = jogadorZero;
    }

    public Jogador getJogadorUm() {
        return jogadorUm;
    }

    public void setJogadorUm(Jogador jogadorUm) {
        this.jogadorUm = jogadorUm;
    }

    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }

    public void executarJogada(Jogador jogador, int posX, int posY) {
        this.tabuleiro.getMatriz()[posX][posY] = jogador.getSimbolo();
    }
}
