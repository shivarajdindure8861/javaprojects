package com.axis.pyramid;

class Pyramids {
    public void leftPyramid(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void rightPyramid(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }
    }

    public void centreOyramid(int row) {
        for (int i = 1; i <= row; i++) {

        }
    }
}

public class PyramidMain {
    public static void main(String[] args) {
        Pyramids py = new Pyramids();
        py.leftPyramid(5);
        py.rightPyramid(5);
    }
}
