package br.com.tasima.tictactoe.model;

import java.util.Arrays;

public class Tabuleiro {
    private char[][] matriz;

    public Tabuleiro() {
        this.matriz = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.matriz[i][j]='_';
            }
        }

    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    @Override
    public String toString() {
        StringBuilder matrizToString = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizToString.append(this.matriz[i][j]);
                if (j<2){
                    matrizToString.append("|");
                }
            }
            if (i<2){
                matrizToString.append("\n");
            }
        }
        return matrizToString.toString();
    }

    public boolean marcarTabuleiro(char simbolo, int posX, int posY) {
        if(posX > 3 || posY > 3){
            return false;
        } else if(this.matriz[posX][posY] == '_'){
            this.matriz[posX][posY] = simbolo;
            return true;
        }  else {
            return false;
        }
    }
}
