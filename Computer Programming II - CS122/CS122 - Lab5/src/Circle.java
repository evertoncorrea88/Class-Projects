/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everton
 */
public class Circle implements Comparable {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Object other) {
        int result;
        if (radius > ((Circle) other).getRadius()) {
            result = 1;
        } else if (radius < ((Circle) other).getRadius()) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (radius == ((Circle) other).getRadius()) {
            return true;
        } else {
            return false;
        }
    }
}
