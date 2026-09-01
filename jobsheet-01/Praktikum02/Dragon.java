package Praktikum02;

public class Dragon { //class Dragon
    int x;
    int y;
    int direction;
    
    public Dragon() {
        x = 0;
        y = 0;
        direction = 1;
    }
    
    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Masukkan angka 1-4 saja");
        }
    }
    public void move(int steps) {
        if (direction ==1) y += steps;
        else if (direction == 2) x += steps;
        else if (direction == 3) y -= steps;
        else if (direction == 4) x -= steps;
    }
    
    public void printStatus() {
        System.out.println("Posisi X: " + x);
        System.out.println("Posisi Y: " + y);
        System.out.println("Direction: " + direction);
    }
}

