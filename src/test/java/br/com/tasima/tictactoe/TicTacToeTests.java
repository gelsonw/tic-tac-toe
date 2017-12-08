package br.com.tasima.tictactoe;

import br.com.tasima.tictactoe.model.Jogador;
import br.com.tasima.tictactoe.model.Partida;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TicTacToeTests {

    @Test
    public void criarPartida(){
        Partida partida = populaPartida("Partida 1", "Jogador 0", "Jogador 1");

        assertEquals("Partida 1", partida.getId());
    }

    @Test
    public void adicionarJogadoresNaPartida(){
        Partida partida = populaPartida("Partida 2", "Jogador 0", "Jogador 1");

        assertEquals("Jogador 0", partida.getJogadorZero().getNome());
        assertEquals("Jogador 1", partida.getJogadorUm().getNome());
    }

    @Test
    public void exibirTabuleiroVazio(){
        Partida partida = populaPartida("Partida 3", "Jogador 0", "Jogador 1");

        assertEquals("_|_|_\n_|_|_\n_|_|_", partida.getTabuleiro().toString());
    }

    @Test
    public void realizarUmaJogadaComSucesso() {
        Partida partida = populaPartida("Partida 4", "Jogador 0", "Jogador 1");

        boolean resultadoJogada = partida.executarJogada(partida.getJogadorZero(), 0, 0);
        assertTrue(resultadoJogada);
        assertEquals("0|_|_\n_|_|_\n_|_|_", partida.getTabuleiro().toString());
    }

    @Test
    public void realizarUmaJogadaComMarcacaoExistente() {
        Partida partida = populaPartida("Partida 5", "Jogador 0", "Jogador 1");

        boolean resultadoJogadaUm = partida.executarJogada(partida.getJogadorZero(), 0, 0);
        boolean resultadoJogadaDois = partida.executarJogada(partida.getJogadorUm(), 0, 0);
        assertTrue(resultadoJogadaUm);
        assertFalse(resultadoJogadaDois);
        assertEquals("0|_|_\n_|_|_\n_|_|_", partida.getTabuleiro().toString());
    }

    @Test
    public void validaJogadaComPosicaoInexistente(){
        Partida partida = populaPartida("Partida 6", "Jogador 0", "Jogador 1");
        boolean resultadoJogadaUm = partida.executarJogada(partida.getJogadorZero(), 5, 5);
        
        assertFalse(resultadoJogadaUm);
    }

    private Partida populaPartida(String idPartida, String nomeJogadorZero, String nomeJogadorUm) {
        Partida partida = new Partida(idPartida);
        partida.setJogadorZero(new Jogador(nomeJogadorZero, '0'));
        partida.setJogadorUm(new Jogador(nomeJogadorUm, '1'));
        return partida;
    }



}
