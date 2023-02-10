package utils;

import java.util.Random;

public class utils {
    public static int getRandomInt(int min, int max) {
        Random r = new Random();

        return r.nextInt((max - min) + 1) + min;
    }
}

