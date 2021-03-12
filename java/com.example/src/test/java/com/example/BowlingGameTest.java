package com.example;

import com.example.BowlingGame.BowlingGame;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*Este ejemplo es una prueba de puntaje de un juego de bolos,
*posee 5 test para tomar en cuenta todas las opcines
*/
public class BowlingGameTest {
    private BowlingGame bowlingGame;


    @Before //creación del objeto bowlingGame
    public void setUp() throws Exception {
        bowlingGame =  new BowlingGame();
    }

    @Test //prueba si todos los lanzamientos se van por la canaleta
    public void TestGutterGame() throws Exception {
        rollMany(20,0);
        assertEquals(0, bowlingGame.score());
    }

    @Test //prueba que se derriben 10 bolos en 2 lanzamientos de 1 turno
    public void testOneSpare() throws Exception {
        rollSpare();
        bowlingGame.roll(3);
        bowlingGame.roll(0);
        rollMany(17,0);
        assertEquals(16,bowlingGame.score());
    }

    @Test // prueba que todos los lanzamientos tengan puntaje 1
    public void testAllOnes() throws Exception {
        rollMany(20,1);
        assertEquals(20, bowlingGame.score());
    }

    @Test //prueba de un strike, es decir si el jugador derriba 10 bolos en el primer turno
    public void testOneStrike() throws Exception {
        rollStrike();
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        rollMany(16,0);
        assertEquals(24, bowlingGame.score());
    }

    @Test //prueba un juego perfecto es decir todos los lanzamientos son strikes
    public void testPerfectGame() throws Exception {
        rollMany(12,10);
        assertEquals(300,bowlingGame.score());
    }

    //metodo que permite simular multiples lanzamientos
    private void rollMany (int n, int pins){
        for (int i = 0; i < n; i++) {
                bowlingGame.roll(pins);
        }
    }

    //metodo que permite lanzar un spare
    private void rollSpare(){
        bowlingGame.roll(5);
        bowlingGame.roll(5);
    }

    //metodo que permite lanzar un strike
    private void rollStrike(){
        bowlingGame.roll(10);
    }
}


