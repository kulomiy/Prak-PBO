package Praktikum02;

public class DragonMain {
    public static void main(String[] args) {
        
        System.out.println("Dragon 1");
        Dragon dragon1 = new Dragon();
        
        dragon1.move(5);
        dragon1.changeDirection(2);
        dragon1.move(10);
        dragon1.printStatus();

        System.out.println("Dragon 2");
        Dragon dragon2 = new Dragon();
        dragon2.changeDirection(4);
        dragon2.move(20);
        dragon2.changeDirection(3);
        dragon2.move(5);
        dragon2.printStatus();
    }
}