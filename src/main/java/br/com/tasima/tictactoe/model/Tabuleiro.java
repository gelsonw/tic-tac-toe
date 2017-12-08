package br.com.tasima.tictactoe.model;

import java.util.Arrays;

public class Tabuleiro {
    private char[][] matriz;

    public Tabuleiro() {
        this.matriz = new char[3][3];
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    @Override
    public String toString() {
        return "_|_|_\n_|_|_\n_|_|_";
    }
}
