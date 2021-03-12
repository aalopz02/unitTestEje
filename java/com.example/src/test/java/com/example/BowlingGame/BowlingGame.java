package com.example.BowlingGame;

public class BowlingGame {

    private int[] rolls=new int[21];
    private int currentRoll =0;

    public void roll(int pins) {
        rolls[currentRoll++]=pins;
    }

    public int score() {
        int score=0;
        int frameIndex=0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex)) {
                score += 10 + StrikeBonus(frameIndex);
                frameIndex ++;
            }else if (isSpare(frameIndex)){
                score+=10+ spareBonus(frameIndex);
                frameIndex+=2;
            }else {
                score+= sumOfBallsInframe(frameIndex);
                frameIndex+=2;
            }

        }
        return score;
    }

    //metodos varios usados para calcular el puntaje del juego

    //para saber si es un strike
    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] ==10;
    }
    //para saber los puntajes de un turno
    private int sumOfBallsInframe(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex+1];
    }

    //para saber los puntos extra a un spare
    private int spareBonus(int frameIndex) {
        return rolls[frameIndex+2];
    }

    //para saber los puntos extra a un strike
    private int StrikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    //para saber si es un spare
    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }
}
