package br.com.tasima.tictactoe;

import br.com.tasima.tictactoe.model.Jogador;
import br.com.tasima.tictactoe.model.Partida;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TicTacToeTests {

    @Test
    public void criarPartida(){
        Partida partida = new Partida("Partida 1");

        assertEquals("Partida 1", partida.getId());
    }

    @Test
    public void adicionarJogadoresNaPartida(){
        Partida partida = new Partida("Partida 2");
        partida.setJogadorZero(new Jogador("Jogador 0", '0'));
        partida.setJogadorUm(new Jogador("Jogador 1", '1'));

        assertEquals("Jogador 0", partida.getJogadorZero().getNome());
        assertEquals("Jogador 1", partida.getJogadorUm().getNome());
    }

    @Test
    public void exibirTabuleiroVazio(){
        Partida partida = new Partida("Partida 3");

        assertEquals("_|_|_\n_|_|_\n_|_|_", partida.getTabuleiro().toString());
    }


}
