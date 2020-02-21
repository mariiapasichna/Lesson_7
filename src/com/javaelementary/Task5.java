package com.javaelementary;

import java.util.ArrayList;
import java.util.List;

/*
5*. Есть фрагмент кода, который при запуске выдает ошибку NullPointerException. Найдите и исправьте ошибку:
*/

public class Task5 {
    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.count());
    }

    private static class Ball {
    }

    private static class Board {
        private List<Ball> balls = new ArrayList<>();

        public Board() {
            balls.add(new Ball());
            balls.add(new Ball());
            balls.add(new Ball());
        }

        public int count() {
            return balls.size();
        }
    }
}